package zendesk.support;

import com.zendesk.logger.Logger;
import defpackage.mn0;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public class Article implements Serializable {
    private static final String LOG_TAG = "Article";
    public static final int UNKNOWN_VOTE_COUNT = -1;
    private zendesk.core.User author;
    private Long authorId;
    private String body;
    private boolean commentsDisabled;
    private Date createdAt;
    private boolean draft;
    private String htmlUrl;
    private Long id;
    private List<String> labelNames;
    private String locale;
    private boolean outdated;
    private Integer position;
    private Long sectionId;
    private String sourceLocale;
    private String title;
    private Date updatedAt;
    private String url;
    private Integer voteCount;
    private Integer voteSum;

    public zendesk.core.User getAuthor() {
        return this.author;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public int getDownvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return Math.abs(num.intValue() - this.voteCount.intValue()) / 2;
        }
        Logger.d(LOG_TAG, "Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public Long getId() {
        return this.id;
    }

    public List<String> getLabelNames() {
        return mn0.b(this.labelNames);
    }

    public String getLocale() {
        return this.locale;
    }

    public Integer getPosition() {
        Integer num = this.position;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    public String getSourceLocale() {
        return this.sourceLocale;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public int getUpvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return (num.intValue() + this.voteCount.intValue()) / 2;
        }
        Logger.d(LOG_TAG, "Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVoteCount() {
        Integer num = this.voteCount;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getVoteSum() {
        Integer num = this.voteSum;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean isCommentsDisabled() {
        return this.commentsDisabled;
    }

    public boolean isDraft() {
        return this.draft;
    }

    public boolean isOutdated() {
        return this.outdated;
    }

    public void setAuthor(zendesk.core.User user) {
        this.author = user;
    }
}
