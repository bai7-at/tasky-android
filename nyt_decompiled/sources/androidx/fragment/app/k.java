package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import defpackage.ao6;

/* loaded from: classes.dex */
class k implements LayoutInflater.Factory2 {
    final FragmentManager a;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ o a;

        a(o oVar) {
            this.a = oVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.a.k();
            this.a.m();
            SpecialEffectsController.r((ViewGroup) k.mView.getParent(), k.this.a).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    k(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        o w;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ao6.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(ao6.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(ao6.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(ao6.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment j0 = resourceId != -1 ? this.a.j0(resourceId) : null;
        if (j0 == null && string != null) {
            j0 = this.a.k0(string);
        }
        if (j0 == null && id != -1) {
            j0 = this.a.j0(id);
        }
        if (j0 == null) {
            j0 = this.a.w0().a(context.getClassLoader(), attributeValue);
            j0.mFromLayout = true;
            j0.mFragmentId = resourceId != 0 ? resourceId : id;
            j0.mContainerId = id;
            j0.mTag = string;
            j0.mInLayout = true;
            FragmentManager fragmentManager = this.a;
            j0.mFragmentManager = fragmentManager;
            j0.mHost = fragmentManager.y0();
            j0.onInflate(this.a.y0().f(), attributeSet, j0.mSavedFragmentState);
            w = this.a.j(j0);
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Fragment " + j0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (j0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            j0.mInLayout = true;
            FragmentManager fragmentManager2 = this.a;
            j0.mFragmentManager = fragmentManager2;
            j0.mHost = fragmentManager2.y0();
            j0.onInflate(this.a.y0().f(), attributeSet, j0.mSavedFragmentState);
            w = this.a.w(j0);
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + j0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.g(j0, viewGroup);
        j0.mContainer = viewGroup;
        w.m();
        w.j();
        View view2 = j0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (j0.mView.getTag() == null) {
            j0.mView.setTag(string);
        }
        j0.mView.addOnAttachStateChangeListener(new a(w));
        return j0.mView;
    }
}
