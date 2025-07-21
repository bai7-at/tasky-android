package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.player.o;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public final class zh4 extends MediaControllerCompat.a {
    private final BehaviorSubject d;
    private final BehaviorSubject e;
    private final BehaviorSubject f;

    public zh4() {
        BehaviorSubject create = BehaviorSubject.create();
        zq3.g(create, "create(...)");
        this.d = create;
        BehaviorSubject create2 = BehaviorSubject.create();
        zq3.g(create2, "create(...)");
        this.e = create2;
        BehaviorSubject create3 = BehaviorSubject.create();
        zq3.g(create3, "create(...)");
        this.f = create3;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public void b(boolean z) {
        this.f.onNext(Boolean.valueOf(z));
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public void d(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat != null) {
            try {
                this.e.onNext(o.a(mediaMetadataCompat));
            } catch (IllegalStateException e) {
                NYTLogger.i(e, "error converting media metadata to model", new Object[0]);
            }
        }
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public void e(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat != null) {
            this.d.onNext(playbackStateCompat);
        }
    }

    public final Observable o() {
        Observable<T> hide = this.f.hide();
        zq3.g(hide, "hide(...)");
        return hide;
    }

    public final Observable p() {
        Observable<T> hide = this.e.hide();
        zq3.g(hide, "hide(...)");
        return hide;
    }

    public final Observable q() {
        Observable<T> hide = this.d.hide();
        zq3.g(hide, "hide(...)");
        return hide;
    }
}
