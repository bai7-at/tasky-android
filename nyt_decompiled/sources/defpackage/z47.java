package defpackage;

import androidx.room.EmptyResultSetException;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class z47 {
    public static final Object a = new Object();

    class a implements SingleOnSubscribe {
        final /* synthetic */ Callable a;

        a(Callable callable) {
            this.a = callable;
        }

        @Override // io.reactivex.SingleOnSubscribe
        public void subscribe(SingleEmitter singleEmitter) {
            try {
                singleEmitter.onSuccess(this.a.call());
            } catch (EmptyResultSetException e) {
                singleEmitter.tryOnError(e);
            }
        }
    }

    public static Single a(Callable callable) {
        return Single.create(new a(callable));
    }
}
