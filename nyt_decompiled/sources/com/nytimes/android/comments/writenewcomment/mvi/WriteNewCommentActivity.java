package com.nytimes.android.comments.writenewcomment.mvi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentIntent;
import com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt;
import defpackage.c04;
import defpackage.ce5;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.xs5;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class WriteNewCommentActivity extends Hilt_WriteNewCommentActivity {
    public static final String ALERT_TYPE_EXTRA = "ALERT_TYPE";
    private final c04 viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static abstract class Result implements Parcelable {
        public static final int $stable = 0;

        public static final class SuccessUnverifiedWithEmail extends Result {
            public static final int $stable = 0;
            public static final SuccessUnverifiedWithEmail INSTANCE = new SuccessUnverifiedWithEmail();
            public static final Parcelable.Creator<SuccessUnverifiedWithEmail> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<SuccessUnverifiedWithEmail> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SuccessUnverifiedWithEmail createFromParcel(Parcel parcel) {
                    zq3.h(parcel, "parcel");
                    parcel.readInt();
                    return SuccessUnverifiedWithEmail.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SuccessUnverifiedWithEmail[] newArray(int i) {
                    return new SuccessUnverifiedWithEmail[i];
                }
            }

            private SuccessUnverifiedWithEmail() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                zq3.h(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public static final class SuccessUnverifiedWithoutEmail extends Result {
            public static final int $stable = 0;
            public static final SuccessUnverifiedWithoutEmail INSTANCE = new SuccessUnverifiedWithoutEmail();
            public static final Parcelable.Creator<SuccessUnverifiedWithoutEmail> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<SuccessUnverifiedWithoutEmail> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SuccessUnverifiedWithoutEmail createFromParcel(Parcel parcel) {
                    zq3.h(parcel, "parcel");
                    parcel.readInt();
                    return SuccessUnverifiedWithoutEmail.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SuccessUnverifiedWithoutEmail[] newArray(int i) {
                    return new SuccessUnverifiedWithoutEmail[i];
                }
            }

            private SuccessUnverifiedWithoutEmail() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                zq3.h(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public static final class SuccessVerified extends Result {
            public static final int $stable = 0;
            public static final SuccessVerified INSTANCE = new SuccessVerified();
            public static final Parcelable.Creator<SuccessVerified> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<SuccessVerified> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SuccessVerified createFromParcel(Parcel parcel) {
                    zq3.h(parcel, "parcel");
                    parcel.readInt();
                    return SuccessVerified.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SuccessVerified[] newArray(int i) {
                    return new SuccessVerified[i];
                }
            }

            private SuccessVerified() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                zq3.h(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    public WriteNewCommentActivity() {
        final qs2 qs2Var = null;
        this.viewModel$delegate = new s(zt6.b(WriteNewCommentViewModel.class), new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WriteNewCommentViewModel getViewModel() {
        return (WriteNewCommentViewModel) this.viewModel$delegate.getValue();
    }

    private final void registerBackButtonCallback() {
        getOnBackPressedDispatcher().h(this, new ce5() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$registerBackButtonCallback$1
            {
                super(true);
            }

            @Override // defpackage.ce5
            public void handleOnBackPressed() {
                WriteNewCommentViewModel viewModel;
                viewModel = WriteNewCommentActivity.this.getViewModel();
                viewModel.intent(WriteNewCommentIntent.CloseScreen.INSTANCE);
            }
        });
    }

    @Override // defpackage.jk, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        zq3.h(context, "base");
        super.attachBaseContext(xs5.Companion.d(context));
    }

    @Override // com.nytimes.android.comments.writenewcomment.mvi.Hilt_WriteNewCommentActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerBackButtonCallback();
        tq0.b(this, null, zr0.c(1831536609, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$onCreate$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                WriteNewCommentViewModel viewModel;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(1831536609, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity.onCreate.<anonymous> (WriteNewCommentActivity.kt:25)");
                }
                viewModel = WriteNewCommentActivity.this.getViewModel();
                final WriteNewCommentActivity writeNewCommentActivity = WriteNewCommentActivity.this;
                ss2 ss2Var = new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$onCreate$1.1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((WriteNewCommentActivity.Result) obj);
                        return ww8.a;
                    }

                    public final void invoke(WriteNewCommentActivity.Result result) {
                        zq3.h(result, "result");
                        Intent intent = new Intent();
                        intent.putExtra(WriteNewCommentActivity.ALERT_TYPE_EXTRA, result);
                        WriteNewCommentActivity.this.setResult(-1, intent);
                        WriteNewCommentActivity.this.finish();
                    }
                };
                final WriteNewCommentActivity writeNewCommentActivity2 = WriteNewCommentActivity.this;
                WriteNewCommentScreenKt.WriteNewCommentScreen(viewModel, ss2Var, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity$onCreate$1.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m285invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m285invoke() {
                        WriteNewCommentActivity.this.setResult(0);
                        WriteNewCommentActivity.this.finish();
                    }
                }, composer, 8);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }
}
