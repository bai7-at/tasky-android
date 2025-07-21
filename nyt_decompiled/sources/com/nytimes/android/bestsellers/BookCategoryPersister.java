package com.nytimes.android.bestsellers;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.bestsellers.BookCategoryPersister;
import com.nytimes.android.bestsellers.vo.BookCategory;
import defpackage.at3;
import defpackage.dt3;
import defpackage.js5;
import defpackage.lf2;
import defpackage.qo;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.Single;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class BookCategoryPersister implements js5 {
    private final File a;
    private final at3 b;

    public BookCategoryPersister(File file) {
        zq3.h(file, "baseDir");
        this.a = file;
        this.b = tt3.b(null, new ss2() { // from class: com.nytimes.android.bestsellers.BookCategoryPersister$format$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.f(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
    }

    private final File e() {
        return new File(this.a, "best-sellers.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BookCategoryPersister bookCategoryPersister, MaybeEmitter maybeEmitter) {
        zq3.h(bookCategoryPersister, "this$0");
        zq3.h(maybeEmitter, "emitter");
        File e = bookCategoryPersister.e();
        if (e.exists()) {
            at3 at3Var = bookCategoryPersister.b;
            String g = lf2.g(e, null, 1, null);
            at3Var.a();
            maybeEmitter.onSuccess(at3Var.c(new qo(BookCategory.Companion.serializer()), g));
        }
        maybeEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean i(BookCategoryPersister bookCategoryPersister, List list) {
        zq3.h(bookCategoryPersister, "this$0");
        zq3.h(list, "$raw");
        File e = bookCategoryPersister.e();
        at3 at3Var = bookCategoryPersister.b;
        at3Var.a();
        lf2.i(e, at3Var.b(new qo(BookCategory.Companion.serializer()), list), null, 2, null);
        return Boolean.TRUE;
    }

    @Override // defpackage.js5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Maybe d(ww8 ww8Var) {
        zq3.h(ww8Var, TransferTable.COLUMN_KEY);
        Maybe create = Maybe.create(new MaybeOnSubscribe() { // from class: p90
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(MaybeEmitter maybeEmitter) {
                BookCategoryPersister.g(BookCategoryPersister.this, maybeEmitter);
            }
        });
        zq3.g(create, "create(...)");
        return create;
    }

    @Override // defpackage.js5
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Single b(ww8 ww8Var, final List list) {
        zq3.h(ww8Var, TransferTable.COLUMN_KEY);
        zq3.h(list, "raw");
        Single fromCallable = Single.fromCallable(new Callable() { // from class: q90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean i;
                i = BookCategoryPersister.i(BookCategoryPersister.this, list);
                return i;
            }
        });
        zq3.g(fromCallable, "fromCallable(...)");
        return fromCallable;
    }
}
