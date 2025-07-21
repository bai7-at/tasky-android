package zendesk.support;

import defpackage.mn0;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public class Request {
    private List<Long> collaboratorIds;
    private EndUserComment comment;
    private Integer commentCount;
    private Date createdAt;
    private List<Object> customFields;
    private String description;
    private Date dueAt;
    private Comment firstComment;
    private String id;
    private Comment lastComment;
    private List<User> lastCommentingAgents;
    private List<Long> lastCommentingAgentsIds;
    private Long organizationId;
    private String priority;
    private Date publicUpdatedAt;
    private Long requesterId;
    private RequestStatus status;
    private String subject;

    /* renamed from: type, reason: collision with root package name */
    private String f338type;
    private Date updatedAt;
    private String url;

    public Request() {
    }

    public List<Long> getCollaboratorIds() {
        return mn0.b(this.collaboratorIds);
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public List<Object> getCustomFields() {
        return this.customFields;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getDueAt() {
        if (this.dueAt == null) {
            return null;
        }
        return new Date(this.dueAt.getTime());
    }

    public Comment getFirstComment() {
        return this.firstComment;
    }

    public String getId() {
        return this.id;
    }

    public Comment getLastComment() {
        return this.lastComment;
    }

    public List<User> getLastCommentingAgents() {
        return mn0.b(this.lastCommentingAgents);
    }

    List<Long> getLastCommentingAgentsIds() {
        return mn0.b(this.lastCommentingAgentsIds);
    }

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public String getPriority() {
        return this.priority;
    }

    public Date getPublicUpdatedAt() {
        return this.publicUpdatedAt == null ? getUpdatedAt() : new Date(this.publicUpdatedAt.getTime());
    }

    public Long getRequesterId() {
        return this.requesterId;
    }

    public RequestStatus getStatus() {
        return this.status;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getType() {
        return this.f338type;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public String getUrl() {
        return this.url;
    }

    public void setComment(EndUserComment endUserComment) {
        this.comment = endUserComment;
    }

    void setLastCommentingAgents(List<User> list) {
        this.lastCommentingAgents = list;
    }

    Request(String str, RequestStatus requestStatus) {
        this.id = str;
        this.status = requestStatus;
    }
}
