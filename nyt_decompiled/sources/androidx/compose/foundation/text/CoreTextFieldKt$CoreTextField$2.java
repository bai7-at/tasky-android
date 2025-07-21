package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id5;
import defpackage.qs2;
import defpackage.ri8;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", l = {348}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ androidx.compose.ui.text.input.b $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ id5 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ ri8 $textInputService;
    final /* synthetic */ x08 $writeable$delegate;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ TextFieldState a;
        final /* synthetic */ ri8 b;
        final /* synthetic */ TextFieldSelectionManager c;
        final /* synthetic */ androidx.compose.ui.text.input.b d;
        final /* synthetic */ id5 e;

        a(TextFieldState textFieldState, ri8 ri8Var, TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.b bVar, id5 id5Var) {
            this.a = textFieldState;
            this.b = ri8Var;
            this.c = textFieldSelectionManager;
            this.d = bVar;
            this.e = id5Var;
        }

        public final Object a(boolean z, by0 by0Var) {
            if (z && this.a.d()) {
                CoreTextFieldKt.r(this.b, this.a, this.c.L(), this.d, this.e);
            } else {
                CoreTextFieldKt.n(this.a);
            }
            return ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Boolean) obj).booleanValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState, x08 x08Var, ri8 ri8Var, TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.b bVar, id5 id5Var, by0 by0Var) {
        super(2, by0Var);
        this.$state = textFieldState;
        this.$writeable$delegate = x08Var;
        this.$textInputService = ri8Var;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = bVar;
        this.$offsetMapping = id5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CoreTextFieldKt$CoreTextField$2(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, this.$offsetMapping, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, ww8] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                final x08 x08Var = this.$writeable$delegate;
                Flow p = y.p(new qs2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        boolean b;
                        b = CoreTextFieldKt.b(x08.this);
                        return Boolean.valueOf(b);
                    }
                });
                a aVar = new a(this.$state, this.$textInputService, this.$manager, this.$imeOptions, this.$offsetMapping);
                this.label = 1;
                if (p.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            CoreTextFieldKt.n(this.$state);
            this = ww8.a;
            return this;
        } catch (Throwable th) {
            CoreTextFieldKt.n(this.$state);
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((CoreTextFieldKt$CoreTextField$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
