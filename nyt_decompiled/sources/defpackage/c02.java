package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.e;

/* loaded from: classes.dex */
public final class c02 {
    private final b a;

    private static class a extends b {
        private final TextView a;
        private final yz1 b;
        private boolean c = true;

        a(TextView textView) {
            this.a = textView;
            this.b = new yz1(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof yz1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g = g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof e02 ? ((e02) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof e02) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new e02(transformationMethod);
        }

        @Override // c02.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // c02.b
        public boolean b() {
            return this.c;
        }

        @Override // c02.b
        void c(boolean z) {
            if (z) {
                l();
            }
        }

        @Override // c02.b
        void d(boolean z) {
            this.c = z;
            l();
            k();
        }

        @Override // c02.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z) {
            this.c = z;
        }

        void l() {
            this.a.setTransformationMethod(e(this.a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z);

        abstract void d(boolean z);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {
        private final a a;

        c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean f() {
            return !e.k();
        }

        @Override // c02.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // c02.b
        public boolean b() {
            return this.a.b();
        }

        @Override // c02.b
        void c(boolean z) {
            if (f()) {
                return;
            }
            this.a.c(z);
        }

        @Override // c02.b
        void d(boolean z) {
            if (f()) {
                this.a.i(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // c02.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.a.e(transformationMethod);
        }
    }

    public c02(TextView textView, boolean z) {
        h16.h(textView, "textView cannot be null");
        if (z) {
            this.a = new a(textView);
        } else {
            this.a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.a.e(transformationMethod);
    }
}
