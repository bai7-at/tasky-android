package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kms.AWSKMSClient;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes2.dex */
public class CryptoModuleDispatcher extends S3CryptoModule<MultipartUploadContext> {
    private final S3CryptoModuleAE ae;
    private final CryptoMode defaultCryptoMode;
    private final S3CryptoModuleEO eo;

    /* renamed from: com.amazonaws.services.s3.internal.crypto.CryptoModuleDispatcher$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$services$s3$model$CryptoMode;

        static {
            int[] iArr = new int[CryptoMode.values().length];
            $SwitchMap$com$amazonaws$services$s3$model$CryptoMode = iArr;
            try {
                iArr[CryptoMode.StrictAuthenticatedEncryption.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$CryptoMode[CryptoMode.AuthenticatedEncryption.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$CryptoMode[CryptoMode.EncryptionOnly.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CryptoModuleDispatcher(AWSKMSClient aWSKMSClient, S3Direct s3Direct, AWSCredentialsProvider aWSCredentialsProvider, EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfiguration) {
        CryptoConfiguration mo158clone = cryptoConfiguration.mo158clone();
        if (mo158clone.getCryptoMode() == null) {
            mo158clone.setCryptoMode(CryptoMode.EncryptionOnly);
        }
        CryptoConfiguration readOnly = mo158clone.readOnly();
        CryptoMode cryptoMode = readOnly.getCryptoMode();
        this.defaultCryptoMode = cryptoMode;
        int i = AnonymousClass1.$SwitchMap$com$amazonaws$services$s3$model$CryptoMode[cryptoMode.ordinal()];
        if (i == 1) {
            this.ae = new S3CryptoModuleAEStrict(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, readOnly);
            this.eo = null;
        } else if (i == 2) {
            this.ae = new S3CryptoModuleAE(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, readOnly);
            this.eo = null;
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            this.eo = new S3CryptoModuleEO(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, readOnly);
            CryptoConfiguration mo158clone2 = readOnly.mo158clone();
            try {
                mo158clone2.setCryptoMode(CryptoMode.AuthenticatedEncryption);
            } catch (UnsupportedOperationException unused) {
            }
            this.ae = new S3CryptoModuleAE(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, mo158clone2.readOnly());
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public void abortMultipartUploadSecurely(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            this.eo.abortMultipartUploadSecurely(abortMultipartUploadRequest);
        } else {
            this.ae.abortMultipartUploadSecurely(abortMultipartUploadRequest);
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        return this.defaultCryptoMode == CryptoMode.EncryptionOnly ? this.eo.completeMultipartUploadSecurely(completeMultipartUploadRequest) : this.ae.completeMultipartUploadSecurely(completeMultipartUploadRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public CopyPartResult copyPartSecurely(CopyPartRequest copyPartRequest) {
        return this.defaultCryptoMode == CryptoMode.EncryptionOnly ? this.eo.copyPartSecurely(copyPartRequest) : this.ae.copyPartSecurely(copyPartRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public S3Object getObjectSecurely(GetObjectRequest getObjectRequest) {
        return this.ae.getObjectSecurely(getObjectRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        return this.defaultCryptoMode == CryptoMode.EncryptionOnly ? this.eo.initiateMultipartUploadSecurely(initiateMultipartUploadRequest) : this.ae.initiateMultipartUploadSecurely(initiateMultipartUploadRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public PutObjectResult putInstructionFileSecurely(PutInstructionFileRequest putInstructionFileRequest) {
        return this.defaultCryptoMode == CryptoMode.EncryptionOnly ? this.eo.putInstructionFileSecurely(putInstructionFileRequest) : this.ae.putInstructionFileSecurely(putInstructionFileRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public void putLocalObjectSecurely(UploadObjectRequest uploadObjectRequest, String str, OutputStream outputStream) throws IOException {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            this.eo.putLocalObjectSecurely(uploadObjectRequest, str, outputStream);
        } else {
            this.ae.putLocalObjectSecurely(uploadObjectRequest, str, outputStream);
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) {
        return this.defaultCryptoMode == CryptoMode.EncryptionOnly ? this.eo.putObjectSecurely(putObjectRequest) : this.ae.putObjectSecurely(putObjectRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest) {
        return this.defaultCryptoMode == CryptoMode.EncryptionOnly ? this.eo.uploadPartSecurely(uploadPartRequest) : this.ae.uploadPartSecurely(uploadPartRequest);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public ObjectMetadata getObjectSecurely(GetObjectRequest getObjectRequest, File file) {
        return this.ae.getObjectSecurely(getObjectRequest, file);
    }
}
