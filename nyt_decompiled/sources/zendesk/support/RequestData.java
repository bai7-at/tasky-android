package zendesk.support;

/* loaded from: classes5.dex */
final class RequestData {
    private final int commentCount;
    private final String id;
    private int readCommentCount;

    private RequestData(String str, int i, int i2) {
        this.commentCount = i;
        this.id = str;
        this.readCommentCount = i2;
    }

    static RequestData create(Request request) {
        return new RequestData(request.getId(), request.getCommentCount().intValue(), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestData.class != obj.getClass()) {
            return false;
        }
        RequestData requestData = (RequestData) obj;
        String str = this.id;
        return str != null ? str.equals(requestData.id) : requestData.id == null;
    }

    int getCommentCount() {
        return this.commentCount;
    }

    String getId() {
        return this.id;
    }

    int getReadCommentCount() {
        return this.readCommentCount;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RequestData{commentCount=" + this.commentCount + "readCommentCount=" + this.readCommentCount + ", id='" + this.id + "'}";
    }

    int unreadComments() {
        return this.commentCount - this.readCommentCount;
    }

    static RequestData create(String str, int i, int i2) {
        return new RequestData(str, i, i2);
    }
}
