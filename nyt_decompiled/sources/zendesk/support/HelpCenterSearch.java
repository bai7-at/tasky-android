package zendesk.support;

import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes5.dex */
public class HelpCenterSearch implements Serializable, Cloneable {
    private String categoryIds;
    private String include;
    private String labelNames;
    private Locale locale;
    private Integer page;
    private Integer perPage;
    private String query;
    private String sectionIds;

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getInclude() {
        return this.include;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    public HelpCenterSearch withQuery(String str) {
        HelpCenterSearch helpCenterSearch = new HelpCenterSearch();
        try {
            HelpCenterSearch helpCenterSearch2 = (HelpCenterSearch) clone();
            try {
                helpCenterSearch2.query = str;
                return helpCenterSearch2;
            } catch (CloneNotSupportedException e) {
                e = e;
                helpCenterSearch = helpCenterSearch2;
                e.printStackTrace();
                return helpCenterSearch;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
        }
    }

    private HelpCenterSearch() {
    }
}
