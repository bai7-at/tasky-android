package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class mz8 {
    private final String displayName;
    private final String email;
    private final String familyName;
    private final String gamesAvatarIcon;
    private final String gamesUsername;
    private final String givenName;
    private final String name;
    private final String regiId;
    private final String username;

    public mz8() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String a() {
        return this.email + " (" + this.regiId + ")";
    }

    public final String b() {
        return this.displayName;
    }

    public final String c() {
        return this.email;
    }

    public final String d() {
        return this.familyName;
    }

    public final String e() {
        return this.gamesAvatarIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz8)) {
            return false;
        }
        mz8 mz8Var = (mz8) obj;
        return zq3.c(this.regiId, mz8Var.regiId) && zq3.c(this.email, mz8Var.email) && zq3.c(this.displayName, mz8Var.displayName) && zq3.c(this.name, mz8Var.name) && zq3.c(this.givenName, mz8Var.givenName) && zq3.c(this.familyName, mz8Var.familyName) && zq3.c(this.username, mz8Var.username) && zq3.c(this.gamesUsername, mz8Var.gamesUsername) && zq3.c(this.gamesAvatarIcon, mz8Var.gamesAvatarIcon);
    }

    public final String f() {
        return this.gamesUsername;
    }

    public final String g() {
        return this.givenName;
    }

    public final String h() {
        return this.name;
    }

    public int hashCode() {
        String str = this.regiId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.givenName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.familyName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.username;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.gamesUsername;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.gamesAvatarIcon;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String i() {
        return this.regiId;
    }

    public final String j() {
        return this.username;
    }

    public String toString() {
        return "UserAccount(regiId=" + this.regiId + ", email=" + this.email + ", displayName=" + this.displayName + ", name=" + this.name + ", givenName=" + this.givenName + ", familyName=" + this.familyName + ", username=" + this.username + ", gamesUsername=" + this.gamesUsername + ", gamesAvatarIcon=" + this.gamesAvatarIcon + ")";
    }

    public mz8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.regiId = str;
        this.email = str2;
        this.displayName = str3;
        this.name = str4;
        this.givenName = str5;
        this.familyName = str6;
        this.username = str7;
        this.gamesUsername = str8;
        this.gamesAvatarIcon = str9;
    }

    public /* synthetic */ mz8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str9);
    }
}
