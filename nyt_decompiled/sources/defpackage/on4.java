package defpackage;

import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import defpackage.sm4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
abstract class on4 {
    static List a(List list) {
        return list == null ? new ArrayList() : (List) list.stream().filter(new Predicate() { // from class: mn4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((MediaRoute2Info) obj);
            }
        }).map(new Function() { // from class: nn4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String id;
                id = ((MediaRoute2Info) obj).getId();
                return id;
            }
        }).collect(Collectors.toList());
    }

    static RouteDiscoveryPreference b(um4 um4Var) {
        RouteDiscoveryPreference build;
        RouteDiscoveryPreference build2;
        if (um4Var == null || !um4Var.e()) {
            cn4.a();
            build = bn4.a(new ArrayList(), false).build();
            return build;
        }
        build2 = bn4.a((List) um4Var.c().e().stream().map(new Function() { // from class: ln4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return on4.d((String) obj);
            }
        }).collect(Collectors.toList()), um4Var.d()).build();
        return build2;
    }

    public static sm4 c(MediaRoute2Info mediaRoute2Info) {
        String id;
        CharSequence name;
        int connectionState;
        int volumeHandling;
        int volumeMax;
        int volume;
        Bundle extras;
        CharSequence description;
        Uri iconUri;
        Bundle extras2;
        if (mediaRoute2Info == null) {
            return null;
        }
        id = mediaRoute2Info.getId();
        name = mediaRoute2Info.getName();
        sm4.a aVar = new sm4.a(id, name.toString());
        connectionState = mediaRoute2Info.getConnectionState();
        sm4.a g = aVar.g(connectionState);
        volumeHandling = mediaRoute2Info.getVolumeHandling();
        sm4.a s = g.s(volumeHandling);
        volumeMax = mediaRoute2Info.getVolumeMax();
        sm4.a t = s.t(volumeMax);
        volume = mediaRoute2Info.getVolume();
        sm4.a r = t.r(volume);
        extras = mediaRoute2Info.getExtras();
        sm4.a f = r.k(extras).j(true).f(false);
        description = mediaRoute2Info.getDescription();
        if (description != null) {
            f.h(description.toString());
        }
        iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            f.l(iconUri);
        }
        extras2 = mediaRoute2Info.getExtras();
        if (extras2 == null || !extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        f.k(extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        f.i(extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        f.p(extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            f.b(parcelableArrayList);
        }
        return f.e();
    }

    static String d(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.intent.category.REMOTE_PLAYBACK":
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case "android.media.intent.category.LIVE_AUDIO":
                return "android.media.route.feature.LIVE_AUDIO";
            case "android.media.intent.category.LIVE_VIDEO":
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}
