package com.nytimes.android.api.cms;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.cms.Video;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class VideoJsonAdapter extends JsonAdapter<Video> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Video> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Video.Channel> nullableChannelAdapter;
    private final JsonAdapter<ContentSeries> nullableContentSeriesAdapter;
    private final JsonAdapter<List<Video.LiveUrl>> nullableListOfLiveUrlAdapter;
    private final JsonAdapter<List<PlaylistRef>> nullableListOfPlaylistRefAdapter;
    private final JsonAdapter<List<Video.VideoFiles>> nullableListOfVideoFilesAdapter;
    private final JsonAdapter<Video.Show> nullableShowAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public VideoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("liveUrls", "isLive", "playlists", "show", "contentSeries", "aspectRatio", AppsFlyerProperties.CHANNEL, "videoFiles", "duration", "canShowAds", "productionType", "transcript");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<Video.LiveUrl>> f = iVar.f(j.j(List.class, Video.LiveUrl.class), b0.e(), "liveUrls");
        zq3.g(f, "adapter(...)");
        this.nullableListOfLiveUrlAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "isLive");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<List<PlaylistRef>> f3 = iVar.f(j.j(List.class, PlaylistRef.class), b0.e(), "playlists");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfPlaylistRefAdapter = f3;
        JsonAdapter<Video.Show> f4 = iVar.f(Video.Show.class, b0.e(), "show");
        zq3.g(f4, "adapter(...)");
        this.nullableShowAdapter = f4;
        JsonAdapter<ContentSeries> f5 = iVar.f(ContentSeries.class, b0.e(), "contentSeries");
        zq3.g(f5, "adapter(...)");
        this.nullableContentSeriesAdapter = f5;
        JsonAdapter<String> f6 = iVar.f(String.class, b0.e(), "aspectRatio");
        zq3.g(f6, "adapter(...)");
        this.nullableStringAdapter = f6;
        JsonAdapter<Video.Channel> f7 = iVar.f(Video.Channel.class, b0.e(), AppsFlyerProperties.CHANNEL);
        zq3.g(f7, "adapter(...)");
        this.nullableChannelAdapter = f7;
        JsonAdapter<List<Video.VideoFiles>> f8 = iVar.f(j.j(List.class, Video.VideoFiles.class), b0.e(), "videoFiles");
        zq3.g(f8, "adapter(...)");
        this.nullableListOfVideoFilesAdapter = f8;
        JsonAdapter<Long> f9 = iVar.f(Long.TYPE, b0.e(), "duration");
        zq3.g(f9, "adapter(...)");
        this.longAdapter = f9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Video");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Video fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        Long l = 0L;
        jsonReader.b();
        int i = -1;
        Boolean bool2 = bool;
        List list = null;
        List list2 = null;
        Video.Show show = null;
        ContentSeries contentSeries = null;
        String str = null;
        Video.Channel channel = null;
        List list3 = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = (List) this.nullableListOfLiveUrlAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x = c29.x("isLive", "isLive", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i &= -3;
                    break;
                case 2:
                    list2 = (List) this.nullableListOfPlaylistRefAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    show = (Video.Show) this.nullableShowAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    contentSeries = (ContentSeries) this.nullableContentSeriesAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    channel = (Video.Channel) this.nullableChannelAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    list3 = (List) this.nullableListOfVideoFilesAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x2 = c29.x("duration", "duration", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -257;
                    break;
                case 9:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException x3 = c29.x("canShowAds", "canShowAds", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i &= -513;
                    break;
                case 10:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -1025;
                    break;
                case 11:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2049;
                    break;
            }
        }
        jsonReader.h();
        if (i == -4096) {
            return new Video(list, bool2.booleanValue(), list2, show, contentSeries, str, channel, list3, l.longValue(), bool.booleanValue(), str2, str3);
        }
        Constructor<Video> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = Video.class.getDeclaredConstructor(List.class, cls, List.class, Video.Show.class, ContentSeries.class, String.class, Video.Channel.class, List.class, Long.TYPE, cls, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Video newInstance = constructor.newInstance(list, bool2, list2, show, contentSeries, str, channel, list3, l, bool, str2, str3, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Video video) {
        zq3.h(hVar, "writer");
        if (video == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("liveUrls");
        this.nullableListOfLiveUrlAdapter.mo197toJson(hVar, video.getLiveUrls());
        hVar.C("isLive");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(video.isLive()));
        hVar.C("playlists");
        this.nullableListOfPlaylistRefAdapter.mo197toJson(hVar, video.getPlaylists());
        hVar.C("show");
        this.nullableShowAdapter.mo197toJson(hVar, video.getShow());
        hVar.C("contentSeries");
        this.nullableContentSeriesAdapter.mo197toJson(hVar, video.getContentSeries());
        hVar.C("aspectRatio");
        this.nullableStringAdapter.mo197toJson(hVar, video.getAspectRatio());
        hVar.C(AppsFlyerProperties.CHANNEL);
        this.nullableChannelAdapter.mo197toJson(hVar, video.getChannel());
        hVar.C("videoFiles");
        this.nullableListOfVideoFilesAdapter.mo197toJson(hVar, video.getVideoFiles());
        hVar.C("duration");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(video.getDuration()));
        hVar.C("canShowAds");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(video.getCanShowAds()));
        hVar.C("productionType");
        this.nullableStringAdapter.mo197toJson(hVar, video.getProductionType());
        hVar.C("transcript");
        this.nullableStringAdapter.mo197toJson(hVar, video.getTranscript());
        hVar.l();
    }
}
