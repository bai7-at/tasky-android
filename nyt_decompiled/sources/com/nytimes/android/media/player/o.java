package com.nytimes.android.media.player;

import android.support.v4.media.MediaMetadataCompat;
import com.nytimes.android.media.common.AudioPosition;
import com.nytimes.android.media.common.AudioType;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class o {
    public static final o a = new o();

    private o() {
    }

    public static final NYTMediaItem a(MediaMetadataCompat mediaMetadataCompat) {
        zq3.h(mediaMetadataCompat, "metadata");
        if (!a.c(mediaMetadataCompat)) {
            throw new IllegalArgumentException("Media Metadata does not contain necessary fields to build NytMediaItem");
        }
        String g = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        String g2 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        String g3 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        String g4 = mediaMetadataCompat.g("com.nytimes.android.media.player.nyt_media_id");
        long e = mediaMetadataCompat.e(MediaMetadataCompat.METADATA_KEY_DURATION);
        boolean z = mediaMetadataCompat.e(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT) == 1;
        String g5 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_TITLE);
        String g6 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        String g7 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        String g8 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI);
        Long valueOf = mediaMetadataCompat.a("com.nytimes.android.media.player.nyt_media_duration") ? Long.valueOf(mediaMetadataCompat.e("com.nytimes.android.media.player.nyt_media_duration")) : null;
        String g9 = mediaMetadataCompat.g("com.nytimes.android.media.player.nyt_media_franchise");
        AudioPosition a2 = AudioPosition.Companion.a(mediaMetadataCompat.g("com.nytimes.android.media.player.nyt_media_position"));
        AudioType a3 = AudioType.Companion.a(mediaMetadataCompat.g("com.nytimes.android.media.player.nyt_media_type"));
        String g10 = mediaMetadataCompat.g("com.nytimes.android.media.player.nyt_media_section");
        String g11 = mediaMetadataCompat.g("com.nytimes.android.media.player.nyt_media_playlist_name");
        Long valueOf2 = mediaMetadataCompat.a("com.nytimes.android.media.player.nyt_media_playlist_id") ? Long.valueOf(mediaMetadataCompat.e("com.nytimes.android.media.player.nyt_media_playlist_id")) : null;
        String g12 = mediaMetadataCompat.g("com.nytimes.android.media.player.subscriber_url");
        String g13 = mediaMetadataCompat.g("com.nytimes.android.media.player.share_url");
        String g14 = mediaMetadataCompat.g("com.nytimes.android.media.player.video_aspect_ratio");
        String g15 = mediaMetadataCompat.g("com.nytimes.android.media.player.media_referring_source");
        PlaybackVolume fromId = PlaybackVolume.fromId(mediaMetadataCompat.g("com.nytimes.android.media.player.media_metadata_key_volume"));
        Long valueOf3 = mediaMetadataCompat.a("com.nytimes.android.media.player.parent_asset_id") ? Long.valueOf(mediaMetadataCompat.e("com.nytimes.android.media.player.parent_asset_id")) : null;
        String g16 = mediaMetadataCompat.g("com.nytimes.android.media.player.parent_asset_uri");
        Boolean valueOf4 = Boolean.valueOf(mediaMetadataCompat.g("com.nytimes.android.media.player.is_live_video"));
        String g17 = mediaMetadataCompat.g("com.nytimes.android.media.player.podcast_name_key");
        String g18 = mediaMetadataCompat.g("com.nytimes.android.media.player.video_byline");
        String g19 = mediaMetadataCompat.g("com.nytimes.android.media.player.web_page_url");
        String g20 = mediaMetadataCompat.g("com.nytimes.android.media.player.ad_unit_taxonomy");
        Boolean valueOf5 = Boolean.valueOf(mediaMetadataCompat.g("com.nytimes.android.media.player.is_tragedy_tagged"));
        Boolean valueOf6 = Boolean.valueOf(mediaMetadataCompat.g("com.nytimes.android.media.player.is_autoplay"));
        Boolean valueOf7 = Boolean.valueOf(mediaMetadataCompat.g("com.nytimes.android.media.player.is_cinemagraph"));
        String g21 = mediaMetadataCompat.g(MediaMetadataCompat.METADATA_KEY_MEDIA_ID);
        Boolean valueOf8 = mediaMetadataCompat.a("com.nytimes.android.media.player.captions_availability") ? Boolean.valueOf(mediaMetadataCompat.g("com.nytimes.android.media.player.captions_availability")) : null;
        String g22 = mediaMetadataCompat.a("com.nytimes.android.media.player.asset_uri") ? mediaMetadataCompat.g("com.nytimes.android.media.player.asset_uri") : null;
        String g23 = mediaMetadataCompat.g("com.nytimes.android.media.player.active_view");
        NYTMediaItem.ActiveView valueOf9 = g23 != null ? NYTMediaItem.ActiveView.valueOf(g23) : null;
        zq3.e(g4);
        zq3.e(g3);
        zq3.e(g);
        zq3.e(valueOf6);
        boolean booleanValue = valueOf6.booleanValue();
        zq3.e(fromId);
        zq3.e(valueOf4);
        boolean booleanValue2 = valueOf4.booleanValue();
        zq3.e(valueOf5);
        boolean booleanValue3 = valueOf5.booleanValue();
        zq3.e(g21);
        zq3.e(valueOf7);
        return new NYTMediaItem(g4, g3, g, g2, e, booleanValue, z, g22, g5, g6, g7, g8, valueOf, g9, a2, a3, null, g10, g11, valueOf2, g12, g13, g14, g15, valueOf8, fromId, valueOf3, g16, booleanValue2, g17, g18, g19, null, g20, booleanValue3, g21, valueOf7.booleanValue(), false, null, null, null, valueOf9, 65536, 481, null);
    }

    private final boolean c(MediaMetadataCompat mediaMetadataCompat) {
        return mediaMetadataCompat.a(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE) && mediaMetadataCompat.a(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION) && mediaMetadataCompat.a(MediaMetadataCompat.METADATA_KEY_MEDIA_URI) && mediaMetadataCompat.a("com.nytimes.android.media.player.nyt_media_id");
    }

    public final MediaMetadataCompat b(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        bVar.c(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, nYTMediaItem.p());
        bVar.c(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, nYTMediaItem.o());
        bVar.c(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, nYTMediaItem.Y());
        bVar.c("com.nytimes.android.media.player.nyt_media_id", nYTMediaItem.a());
        bVar.b(MediaMetadataCompat.METADATA_KEY_DURATION, nYTMediaItem.q());
        bVar.b(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, nYTMediaItem.O() ? 1L : 0L);
        String g = nYTMediaItem.g();
        if (g != null) {
            bVar.c(MediaMetadataCompat.METADATA_KEY_TITLE, g);
        }
        String k = nYTMediaItem.k();
        if (k != null) {
            bVar.c(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, k);
        }
        String N = nYTMediaItem.N();
        if (N != null) {
            bVar.c(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, N);
        }
        String c = nYTMediaItem.c();
        if (c != null) {
            bVar.c(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, c);
        }
        Long V = nYTMediaItem.V();
        if (V != null) {
            bVar.b("com.nytimes.android.media.player.nyt_media_duration", V.longValue());
        }
        bVar.c("com.nytimes.android.media.player.nyt_media_franchise", nYTMediaItem.W());
        AudioPosition h = nYTMediaItem.h();
        if (h != null) {
            bVar.c("com.nytimes.android.media.player.nyt_media_position", h.getTitle());
        }
        AudioType i = nYTMediaItem.i();
        if (i != null) {
            bVar.c("com.nytimes.android.media.player.nyt_media_type", i.getTitle());
        }
        bVar.c("com.nytimes.android.media.player.nyt_media_section", nYTMediaItem.e0());
        bVar.c("com.nytimes.android.media.player.nyt_media_playlist_name", nYTMediaItem.b0());
        Long a0 = nYTMediaItem.a0();
        if (a0 != null) {
            bVar.b("com.nytimes.android.media.player.nyt_media_playlist_id", a0.longValue());
        }
        String h0 = nYTMediaItem.h0();
        if (h0 != null) {
            bVar.c("com.nytimes.android.media.player.subscriber_url", h0);
        }
        String g0 = nYTMediaItem.g0();
        if (g0 != null) {
            bVar.c("com.nytimes.android.media.player.share_url", g0);
        }
        bVar.c("com.nytimes.android.media.player.video_aspect_ratio", nYTMediaItem.e());
        bVar.c("com.nytimes.android.media.player.media_referring_source", nYTMediaItem.d0());
        Boolean d = nYTMediaItem.d();
        if (d != null) {
            bVar.c("com.nytimes.android.media.player.captions_availability", String.valueOf(d.booleanValue()));
        }
        bVar.c("com.nytimes.android.media.player.media_metadata_key_volume", nYTMediaItem.l0().id);
        Long Z = nYTMediaItem.Z();
        if (Z != null) {
            bVar.b("com.nytimes.android.media.player.parent_asset_id", Z.longValue());
        }
        String F = nYTMediaItem.F();
        if (F != null) {
            bVar.c("com.nytimes.android.media.player.parent_asset_uri", F);
        }
        bVar.c("com.nytimes.android.media.player.is_live_video", Boolean.toString(nYTMediaItem.R()));
        String c0 = nYTMediaItem.c0();
        if (c0 != null) {
            bVar.c("com.nytimes.android.media.player.podcast_name_key", c0);
        }
        String j0 = nYTMediaItem.j0();
        if (j0 != null) {
            bVar.c("com.nytimes.android.media.player.video_byline", j0);
        }
        String m0 = nYTMediaItem.m0();
        if (m0 != null) {
            bVar.c("com.nytimes.android.media.player.web_page_url", m0);
        }
        String b = nYTMediaItem.b();
        if (b != null) {
            bVar.c("com.nytimes.android.media.player.ad_unit_taxonomy", b);
        }
        bVar.c("com.nytimes.android.media.player.is_tragedy_tagged", Boolean.toString(nYTMediaItem.T()));
        bVar.c("com.nytimes.android.media.player.is_autoplay", Boolean.toString(nYTMediaItem.Q()));
        bVar.c("com.nytimes.android.media.player.is_cinemagraph", Boolean.toString(nYTMediaItem.y()));
        bVar.c(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, nYTMediaItem.i0());
        String u = nYTMediaItem.u();
        if (u != null) {
            bVar.c("com.nytimes.android.media.player.asset_uri", u);
        }
        NYTMediaItem.ActiveView r = nYTMediaItem.r();
        if (r != null) {
            bVar.c("com.nytimes.android.media.player.active_view", r.name());
        }
        MediaMetadataCompat a2 = bVar.a();
        zq3.g(a2, "build(...)");
        return a2;
    }
}
