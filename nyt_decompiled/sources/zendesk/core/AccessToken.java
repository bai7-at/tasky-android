package zendesk.core;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
class AccessToken {
    private String accessToken;

    @SerializedName(com.facebook.AccessToken.USER_ID_KEY)
    private String userId;

    AccessToken() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        String str = this.accessToken;
        if (str == null ? accessToken.accessToken != null : !str.equals(accessToken.accessToken)) {
            return false;
        }
        String str2 = this.userId;
        return str2 != null ? str2.equals(accessToken.userId) : accessToken.userId == null;
    }

    String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.accessToken;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    AccessToken(String str, String str2) {
        this.accessToken = str;
        this.userId = str2;
    }
}
