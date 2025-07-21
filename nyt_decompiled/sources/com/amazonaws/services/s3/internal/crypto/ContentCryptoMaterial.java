package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.kms.AWSKMSClient;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.EncryptRequest;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.KeyWrapException;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsAccessor;
import com.amazonaws.services.s3.model.ExtraMaterialsDescription;
import com.amazonaws.services.s3.model.KMSEncryptionMaterials;
import com.amazonaws.services.s3.model.MaterialsDescriptionProvider;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
/* loaded from: classes2.dex */
final class ContentCryptoMaterial {
    private final CipherLite cipherLite;
    private final byte[] encryptedCEK;
    private final Map<String, String> kekMaterialsDescription;
    private final String keyWrappingAlgorithm;

    ContentCryptoMaterial(Map<String, String> map, byte[] bArr, String str, CipherLite cipherLite) {
        this.cipherLite = cipherLite;
        this.keyWrappingAlgorithm = str;
        this.encryptedCEK = (byte[]) bArr.clone();
        this.kekMaterialsDescription = map;
    }

    private static SecretKey cek(byte[] bArr, String str, EncryptionMaterials encryptionMaterials, Provider provider, ContentCryptoScheme contentCryptoScheme, AWSKMSClient aWSKMSClient) {
        Key symmetricKey;
        if (KMSSecuredCEK.isKMSKeyWrapped(str)) {
            return cekByKMS(bArr, str, encryptionMaterials, contentCryptoScheme, aWSKMSClient);
        }
        if (encryptionMaterials.getKeyPair() != null) {
            symmetricKey = encryptionMaterials.getKeyPair().getPrivate();
            if (symmetricKey == null) {
                throw new AmazonClientException("Key encrypting key not available");
            }
        } else {
            symmetricKey = encryptionMaterials.getSymmetricKey();
            if (symmetricKey == null) {
                throw new AmazonClientException("Key encrypting key not available");
            }
        }
        try {
            if (str != null) {
                Cipher cipher = provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
                cipher.init(4, symmetricKey);
                return (SecretKey) cipher.unwrap(bArr, str, 3);
            }
            Cipher cipher2 = provider != null ? Cipher.getInstance(symmetricKey.getAlgorithm(), provider) : Cipher.getInstance(symmetricKey.getAlgorithm());
            cipher2.init(2, symmetricKey);
            return new SecretKeySpec(cipher2.doFinal(bArr), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to decrypt symmetric key from object metadata", e);
        }
    }

    private static SecretKey cekByKMS(byte[] bArr, String str, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, AWSKMSClient aWSKMSClient) {
        return new SecretKeySpec(BinaryUtils.copyAllBytesFrom(aWSKMSClient.decrypt(new DecryptRequest().withEncryptionContext(encryptionMaterials.getMaterialsDescription()).withCiphertextBlob(ByteBuffer.wrap(bArr))).getPlaintext()), contentCryptoScheme.getKeyGeneratorAlgorithm());
    }

    private static String convertStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StringUtils.UTF8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    inputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    static ContentCryptoMaterial create(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, S3CryptoScheme s3CryptoScheme, Provider provider, AWSKMSClient aWSKMSClient, AmazonWebServiceRequest amazonWebServiceRequest) {
        return doCreate(secretKey, bArr, encryptionMaterials, contentCryptoScheme, s3CryptoScheme, provider, aWSKMSClient, amazonWebServiceRequest);
    }

    private static ContentCryptoMaterial doCreate(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, S3CryptoScheme s3CryptoScheme, Provider provider, AWSKMSClient aWSKMSClient, AmazonWebServiceRequest amazonWebServiceRequest) {
        return wrap(secretKey, bArr, contentCryptoScheme, provider, secureCEK(secretKey, encryptionMaterials, s3CryptoScheme.getKeyWrapScheme(), s3CryptoScheme.getSecureRandom(), provider, aWSKMSClient, amazonWebServiceRequest));
    }

    static ContentCryptoMaterial fromInstructionFile(Map<String, String> map, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, boolean z, AWSKMSClient aWSKMSClient) {
        return fromInstructionFile0(map, encryptionMaterialsAccessor, provider, null, ExtraMaterialsDescription.NONE, z, aWSKMSClient);
    }

    private static ContentCryptoMaterial fromInstructionFile0(Map<String, String> map, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, ExtraMaterialsDescription extraMaterialsDescription, boolean z, AWSKMSClient aWSKMSClient) {
        EncryptionMaterials encryptionMaterials;
        int parseInt;
        String str = map.get(Headers.CRYPTO_KEY_V2);
        if (str == null && (str = map.get(Headers.CRYPTO_KEY)) == null) {
            throw new AmazonClientException("Content encrypting key not found.");
        }
        byte[] decode = Base64.decode(str);
        byte[] decode2 = Base64.decode(map.get(Headers.CRYPTO_IV));
        if (decode == null || decode2 == null) {
            throw new AmazonClientException("Necessary encryption info not found in the instruction file " + map);
        }
        String str2 = map.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);
        boolean isKMSKeyWrapped = KMSSecuredCEK.isKMSKeyWrapped(str2);
        Map<String, String> matdescFromJson = matdescFromJson(map.get(Headers.MATERIALS_DESCRIPTION));
        Map<String, String> mergeInto = (extraMaterialsDescription == null || isKMSKeyWrapped) ? matdescFromJson : extraMaterialsDescription.mergeInto(matdescFromJson);
        if (isKMSKeyWrapped) {
            encryptionMaterials = new KMSEncryptionMaterials(matdescFromJson.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID));
            encryptionMaterials.addDescriptions(matdescFromJson);
        } else {
            encryptionMaterials = encryptionMaterialsAccessor == null ? null : encryptionMaterialsAccessor.getEncryptionMaterials(mergeInto);
            if (encryptionMaterials == null) {
                throw new AmazonClientException("Unable to retrieve the encryption materials that originally encrypted object corresponding to instruction file " + map);
            }
        }
        EncryptionMaterials encryptionMaterials2 = encryptionMaterials;
        String str3 = map.get(Headers.CRYPTO_CEK_ALGORITHM);
        boolean z2 = jArr != null;
        ContentCryptoScheme fromCEKAlgo = ContentCryptoScheme.fromCEKAlgo(str3, z2);
        if (z2) {
            decode2 = fromCEKAlgo.adjustIV(decode2, jArr[0]);
        } else {
            int tagLengthInBits = fromCEKAlgo.getTagLengthInBits();
            if (tagLengthInBits > 0 && tagLengthInBits != (parseInt = Integer.parseInt(map.get(Headers.CRYPTO_TAG_LENGTH)))) {
                throw new AmazonClientException("Unsupported tag length: " + parseInt + ", expected: " + tagLengthInBits);
            }
        }
        byte[] bArr = decode2;
        if (z && str2 == null) {
            throw newKeyWrapException();
        }
        return new ContentCryptoMaterial(mergeInto, decode, str2, fromCEKAlgo.createCipherLite(cek(decode, str2, encryptionMaterials2, provider, fromCEKAlgo, aWSKMSClient), bArr, 2, provider));
    }

    static ContentCryptoMaterial fromObjectMetadata(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, boolean z, AWSKMSClient aWSKMSClient) {
        return fromObjectMetadata0(objectMetadata, encryptionMaterialsAccessor, provider, null, ExtraMaterialsDescription.NONE, z, aWSKMSClient);
    }

    private static ContentCryptoMaterial fromObjectMetadata0(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, ExtraMaterialsDescription extraMaterialsDescription, boolean z, AWSKMSClient aWSKMSClient) {
        EncryptionMaterials encryptionMaterials;
        int parseInt;
        Map<String, String> userMetadata = objectMetadata.getUserMetadata();
        String str = userMetadata.get(Headers.CRYPTO_KEY_V2);
        if (str == null && (str = userMetadata.get(Headers.CRYPTO_KEY)) == null) {
            throw new AmazonClientException("Content encrypting key not found.");
        }
        byte[] decode = Base64.decode(str);
        byte[] decode2 = Base64.decode(userMetadata.get(Headers.CRYPTO_IV));
        if (decode == null || decode2 == null) {
            throw new AmazonClientException("Content encrypting key or IV not found.");
        }
        String str2 = userMetadata.get(Headers.MATERIALS_DESCRIPTION);
        String str3 = userMetadata.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);
        boolean isKMSKeyWrapped = KMSSecuredCEK.isKMSKeyWrapped(str3);
        Map<String, String> matdescFromJson = matdescFromJson(str2);
        Map<String, String> mergeInto = (isKMSKeyWrapped || extraMaterialsDescription == null) ? matdescFromJson : extraMaterialsDescription.mergeInto(matdescFromJson);
        if (isKMSKeyWrapped) {
            encryptionMaterials = new KMSEncryptionMaterials(matdescFromJson.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID));
            encryptionMaterials.addDescriptions(matdescFromJson);
        } else {
            encryptionMaterials = encryptionMaterialsAccessor == null ? null : encryptionMaterialsAccessor.getEncryptionMaterials(mergeInto);
            if (encryptionMaterials == null) {
                throw new AmazonClientException("Unable to retrieve the client encryption materials");
            }
        }
        EncryptionMaterials encryptionMaterials2 = encryptionMaterials;
        String str4 = userMetadata.get(Headers.CRYPTO_CEK_ALGORITHM);
        boolean z2 = jArr != null;
        ContentCryptoScheme fromCEKAlgo = ContentCryptoScheme.fromCEKAlgo(str4, z2);
        if (z2) {
            decode2 = fromCEKAlgo.adjustIV(decode2, jArr[0]);
        } else {
            int tagLengthInBits = fromCEKAlgo.getTagLengthInBits();
            if (tagLengthInBits > 0 && tagLengthInBits != (parseInt = Integer.parseInt(userMetadata.get(Headers.CRYPTO_TAG_LENGTH)))) {
                throw new AmazonClientException("Unsupported tag length: " + parseInt + ", expected: " + tagLengthInBits);
            }
        }
        byte[] bArr = decode2;
        if (z && str3 == null) {
            throw newKeyWrapException();
        }
        return new ContentCryptoMaterial(mergeInto, decode, str3, fromCEKAlgo.createCipherLite(cek(decode, str3, encryptionMaterials2, provider, fromCEKAlgo, aWSKMSClient), bArr, 2, provider));
    }

    private String kekMaterialDescAsJson() {
        Map<String, String> kEKMaterialsDescription = getKEKMaterialsDescription();
        if (kEKMaterialsDescription == null) {
            kEKMaterialsDescription = Collections.emptyMap();
        }
        return JsonUtils.mapToString(kEKMaterialsDescription);
    }

    private static Map<String, String> matdescFromJson(String str) {
        Map<String, String> jsonToMap = JsonUtils.jsonToMap(str);
        if (jsonToMap == null) {
            return null;
        }
        return Collections.unmodifiableMap(jsonToMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Map<String, String> mergeMaterialDescriptions(EncryptionMaterials encryptionMaterials, AmazonWebServiceRequest amazonWebServiceRequest) {
        Map<String, String> materialsDescription;
        Map<String, String> materialsDescription2 = encryptionMaterials.getMaterialsDescription();
        if (!(amazonWebServiceRequest instanceof MaterialsDescriptionProvider) || (materialsDescription = ((MaterialsDescriptionProvider) amazonWebServiceRequest).getMaterialsDescription()) == null) {
            return materialsDescription2;
        }
        TreeMap treeMap = new TreeMap(materialsDescription2);
        treeMap.putAll(materialsDescription);
        return treeMap;
    }

    private static KeyWrapException newKeyWrapException() {
        return new KeyWrapException("Missing key-wrap for the content-encrypting-key");
    }

    static String parseInstructionFile(S3Object s3Object) {
        try {
            return convertStreamToString(s3Object.getObjectContent());
        } catch (Exception e) {
            throw new AmazonClientException("Error parsing JSON instruction file", e);
        }
    }

    private static SecuredCEK secureCEK(SecretKey secretKey, EncryptionMaterials encryptionMaterials, S3KeyWrapScheme s3KeyWrapScheme, SecureRandom secureRandom, Provider provider, AWSKMSClient aWSKMSClient, AmazonWebServiceRequest amazonWebServiceRequest) {
        if (encryptionMaterials.isKMSEnabled()) {
            Map<String, String> mergeMaterialDescriptions = mergeMaterialDescriptions(encryptionMaterials, amazonWebServiceRequest);
            EncryptRequest withPlaintext = new EncryptRequest().withEncryptionContext(mergeMaterialDescriptions).withKeyId(encryptionMaterials.getCustomerMasterKeyId()).withPlaintext(ByteBuffer.wrap(secretKey.getEncoded()));
            withPlaintext.withGeneralProgressListener(amazonWebServiceRequest.getGeneralProgressListener()).withRequestMetricCollector(amazonWebServiceRequest.getRequestMetricCollector());
            return new KMSSecuredCEK(BinaryUtils.copyAllBytesFrom(aWSKMSClient.encrypt(withPlaintext).getCiphertextBlob()), mergeMaterialDescriptions);
        }
        Map<String, String> materialsDescription = encryptionMaterials.getMaterialsDescription();
        Key key = encryptionMaterials.getKeyPair() != null ? encryptionMaterials.getKeyPair().getPublic() : encryptionMaterials.getSymmetricKey();
        String keyWrapAlgorithm = s3KeyWrapScheme.getKeyWrapAlgorithm(key, provider);
        try {
            if (keyWrapAlgorithm != null) {
                Cipher cipher = provider == null ? Cipher.getInstance(keyWrapAlgorithm) : Cipher.getInstance(keyWrapAlgorithm, provider);
                cipher.init(3, key, secureRandom);
                return new SecuredCEK(cipher.wrap(secretKey), keyWrapAlgorithm, materialsDescription);
            }
            byte[] encoded = secretKey.getEncoded();
            String algorithm = key.getAlgorithm();
            Cipher cipher2 = provider != null ? Cipher.getInstance(algorithm, provider) : Cipher.getInstance(algorithm);
            cipher2.init(1, key);
            return new SecuredCEK(cipher2.doFinal(encoded), null, materialsDescription);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to encrypt symmetric key", e);
        }
    }

    private String toJsonStringEO() {
        HashMap hashMap = new HashMap();
        hashMap.put(Headers.CRYPTO_KEY, Base64.encodeAsString(getEncryptedCEK()));
        hashMap.put(Headers.CRYPTO_IV, Base64.encodeAsString(this.cipherLite.getIV()));
        hashMap.put(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        return JsonUtils.mapToString(hashMap);
    }

    private ObjectMetadata toObjectMetadataEO(ObjectMetadata objectMetadata) {
        objectMetadata.addUserMetadata(Headers.CRYPTO_KEY, Base64.encodeAsString(getEncryptedCEK()));
        objectMetadata.addUserMetadata(Headers.CRYPTO_IV, Base64.encodeAsString(this.cipherLite.getIV()));
        objectMetadata.addUserMetadata(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        return objectMetadata;
    }

    private boolean usesKMSKey() {
        return KMSSecuredCEK.isKMSKeyWrapped(this.keyWrappingAlgorithm);
    }

    public static ContentCryptoMaterial wrap(SecretKey secretKey, byte[] bArr, ContentCryptoScheme contentCryptoScheme, Provider provider, SecuredCEK securedCEK) {
        return new ContentCryptoMaterial(securedCEK.getMaterialDescription(), securedCEK.getEncrypted(), securedCEK.getKeyWrapAlgorithm(), contentCryptoScheme.createCipherLite(secretKey, bArr, 1, provider));
    }

    CipherLite getCipherLite() {
        return this.cipherLite;
    }

    ContentCryptoScheme getContentCryptoScheme() {
        return this.cipherLite.getContentCryptoScheme();
    }

    byte[] getEncryptedCEK() {
        return (byte[]) this.encryptedCEK.clone();
    }

    Map<String, String> getKEKMaterialsDescription() {
        return this.kekMaterialsDescription;
    }

    String getKeyWrappingAlgorithm() {
        return this.keyWrappingAlgorithm;
    }

    ContentCryptoMaterial recreate(Map<String, String> map, EncryptionMaterialsAccessor encryptionMaterialsAccessor, S3CryptoScheme s3CryptoScheme, Provider provider, AWSKMSClient aWSKMSClient, AmazonWebServiceRequest amazonWebServiceRequest) {
        if (!usesKMSKey() && map.equals(this.kekMaterialsDescription)) {
            throw new SecurityException("Material description of the new KEK must differ from the current one");
        }
        EncryptionMaterials kMSEncryptionMaterials = usesKMSKey() ? new KMSEncryptionMaterials(this.kekMaterialsDescription.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID)) : encryptionMaterialsAccessor.getEncryptionMaterials(this.kekMaterialsDescription);
        EncryptionMaterials encryptionMaterials = encryptionMaterialsAccessor.getEncryptionMaterials(map);
        if (encryptionMaterials != null) {
            ContentCryptoMaterial create = create(cek(this.encryptedCEK, this.keyWrappingAlgorithm, kMSEncryptionMaterials, provider, getContentCryptoScheme(), aWSKMSClient), this.cipherLite.getIV(), encryptionMaterials, getContentCryptoScheme(), s3CryptoScheme, provider, aWSKMSClient, amazonWebServiceRequest);
            if (Arrays.equals(create.encryptedCEK, this.encryptedCEK)) {
                throw new SecurityException("The new KEK must differ from the original");
            }
            return create;
        }
        throw new AmazonClientException("No material available with the description " + map + " from the encryption material provider");
    }

    String toJsonString(CryptoMode cryptoMode) {
        return (cryptoMode != CryptoMode.EncryptionOnly || usesKMSKey()) ? toJsonString() : toJsonStringEO();
    }

    ObjectMetadata toObjectMetadata(ObjectMetadata objectMetadata, CryptoMode cryptoMode) {
        return (cryptoMode != CryptoMode.EncryptionOnly || usesKMSKey()) ? toObjectMetadata(objectMetadata) : toObjectMetadataEO(objectMetadata);
    }

    static ContentCryptoMaterial create(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, S3CryptoScheme s3CryptoScheme, Provider provider, AWSKMSClient aWSKMSClient, AmazonWebServiceRequest amazonWebServiceRequest) {
        return doCreate(secretKey, bArr, encryptionMaterials, s3CryptoScheme.getContentCryptoScheme(), s3CryptoScheme, provider, aWSKMSClient, amazonWebServiceRequest);
    }

    static ContentCryptoMaterial fromInstructionFile(Map<String, String> map, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, ExtraMaterialsDescription extraMaterialsDescription, boolean z, AWSKMSClient aWSKMSClient) {
        return fromInstructionFile0(map, encryptionMaterialsAccessor, provider, jArr, extraMaterialsDescription, z, aWSKMSClient);
    }

    static ContentCryptoMaterial fromObjectMetadata(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, ExtraMaterialsDescription extraMaterialsDescription, boolean z, AWSKMSClient aWSKMSClient) {
        return fromObjectMetadata0(objectMetadata, encryptionMaterialsAccessor, provider, jArr, extraMaterialsDescription, z, aWSKMSClient);
    }

    String toJsonString() {
        HashMap hashMap = new HashMap();
        hashMap.put(Headers.CRYPTO_KEY_V2, Base64.encodeAsString(getEncryptedCEK()));
        hashMap.put(Headers.CRYPTO_IV, Base64.encodeAsString(this.cipherLite.getIV()));
        hashMap.put(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        ContentCryptoScheme contentCryptoScheme = getContentCryptoScheme();
        hashMap.put(Headers.CRYPTO_CEK_ALGORITHM, contentCryptoScheme.getCipherAlgorithm());
        int tagLengthInBits = contentCryptoScheme.getTagLengthInBits();
        if (tagLengthInBits > 0) {
            hashMap.put(Headers.CRYPTO_TAG_LENGTH, String.valueOf(tagLengthInBits));
        }
        String keyWrappingAlgorithm = getKeyWrappingAlgorithm();
        if (keyWrappingAlgorithm != null) {
            hashMap.put(Headers.CRYPTO_KEYWRAP_ALGORITHM, keyWrappingAlgorithm);
        }
        return JsonUtils.mapToString(hashMap);
    }

    private ObjectMetadata toObjectMetadata(ObjectMetadata objectMetadata) {
        objectMetadata.addUserMetadata(Headers.CRYPTO_KEY_V2, Base64.encodeAsString(getEncryptedCEK()));
        objectMetadata.addUserMetadata(Headers.CRYPTO_IV, Base64.encodeAsString(this.cipherLite.getIV()));
        objectMetadata.addUserMetadata(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        ContentCryptoScheme contentCryptoScheme = getContentCryptoScheme();
        objectMetadata.addUserMetadata(Headers.CRYPTO_CEK_ALGORITHM, contentCryptoScheme.getCipherAlgorithm());
        int tagLengthInBits = contentCryptoScheme.getTagLengthInBits();
        if (tagLengthInBits > 0) {
            objectMetadata.addUserMetadata(Headers.CRYPTO_TAG_LENGTH, String.valueOf(tagLengthInBits));
        }
        String keyWrappingAlgorithm = getKeyWrappingAlgorithm();
        if (keyWrappingAlgorithm != null) {
            objectMetadata.addUserMetadata(Headers.CRYPTO_KEYWRAP_ALGORITHM, keyWrappingAlgorithm);
        }
        return objectMetadata;
    }

    ContentCryptoMaterial recreate(EncryptionMaterials encryptionMaterials, EncryptionMaterialsAccessor encryptionMaterialsAccessor, S3CryptoScheme s3CryptoScheme, Provider provider, AWSKMSClient aWSKMSClient, AmazonWebServiceRequest amazonWebServiceRequest) {
        EncryptionMaterials encryptionMaterials2;
        if (!usesKMSKey() && encryptionMaterials.getMaterialsDescription().equals(this.kekMaterialsDescription)) {
            throw new SecurityException("Material description of the new KEK must differ from the current one");
        }
        if (usesKMSKey()) {
            encryptionMaterials2 = new KMSEncryptionMaterials(this.kekMaterialsDescription.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID));
        } else {
            encryptionMaterials2 = encryptionMaterialsAccessor.getEncryptionMaterials(this.kekMaterialsDescription);
        }
        ContentCryptoMaterial create = create(cek(this.encryptedCEK, this.keyWrappingAlgorithm, encryptionMaterials2, provider, getContentCryptoScheme(), aWSKMSClient), this.cipherLite.getIV(), encryptionMaterials, getContentCryptoScheme(), s3CryptoScheme, provider, aWSKMSClient, amazonWebServiceRequest);
        if (Arrays.equals(create.encryptedCEK, this.encryptedCEK)) {
            throw new SecurityException("The new KEK must differ from the original");
        }
        return create;
    }
}
