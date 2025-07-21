package zendesk.core;

import java.util.Map;

/* loaded from: classes5.dex */
public class PageView {
    private String channel;
    private String navigatorLanguage;
    private Long pageId;
    private String pageLocale;
    private String pageTitle;
    private String url;
    private Map<String, Object> value;
    private String version;

    public PageView(String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        this.version = str;
        this.channel = str2;
        this.url = str3;
        this.navigatorLanguage = str4;
        this.pageTitle = str5;
        this.pageId = l;
        this.pageLocale = str6;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getNavigatorLanguage() {
        return this.navigatorLanguage;
    }

    public Long getPageId() {
        return this.pageId;
    }

    public String getPageLocale() {
        return this.pageLocale;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public String getUrl() {
        return this.url;
    }

    public Map<String, Object> getValue() {
        return this.value;
    }

    public String getVersion() {
        return this.version;
    }

    public PageView(String str, String str2, String str3, String str4, String str5, Long l, String str6, Map<String, Object> map) {
        this(str, str2, str3, str4, str5, l, str6);
        this.value = map;
    }
}
