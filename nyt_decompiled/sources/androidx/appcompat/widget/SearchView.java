package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.f41;
import defpackage.fe6;
import defpackage.fn0;
import defpackage.fo6;
import defpackage.k99;
import defpackage.nc6;
import defpackage.rm6;
import defpackage.sn8;
import defpackage.zf6;
import defpackage.zi6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends x implements fn0 {
    static final o M0 = null;
    private int A0;
    final ImageView B;
    SearchableInfo B0;
    private Bundle C0;
    private final Runnable D0;
    private Runnable E0;
    private final WeakHashMap F0;
    private final View.OnClickListener G0;
    final ImageView H;
    View.OnKeyListener H0;
    private final TextView.OnEditorActionListener I0;
    private final AdapterView.OnItemClickListener J0;
    private final AdapterView.OnItemSelectedListener K0;
    private final View L;
    private TextWatcher L0;
    private p M;
    private Rect N;
    private Rect Q;
    private int[] S;
    private int[] e0;
    private final ImageView f0;
    private final Drawable g0;
    private final int h0;
    private final int i0;
    private final Intent j0;
    private final Intent k0;
    private final CharSequence l0;
    View.OnFocusChangeListener m0;
    private View.OnClickListener n0;
    private boolean o0;
    private boolean p0;
    f41 q0;
    private boolean r0;
    final SearchAutoComplete s;
    private CharSequence s0;
    private final View t;
    private boolean t0;
    private final View u;
    private boolean u0;
    private int v0;
    private final View w;
    private boolean w0;
    final ImageView x;
    private CharSequence x0;
    final ImageView y;
    private CharSequence y0;
    private boolean z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean isIconified;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.isIconified + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.isIconified));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {
        private int e;
        private SearchView f;
        private boolean g;
        final Runnable h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, nc6.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f41 f41Var = SearchView.this.q0;
            if (f41Var instanceof c0) {
                f41Var.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.m0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            SearchView searchView = SearchView.this;
            if (view == searchView.x) {
                searchView.V();
                return;
            }
            if (view == searchView.B) {
                searchView.R();
                return;
            }
            if (view == searchView.y) {
                searchView.W();
            } else if (view == searchView.H) {
                searchView.a0();
            } else if (view == searchView.s) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.B0 == null) {
                return false;
            }
            if (searchView.s.isPopupShowing() && SearchView.this.s.getListSelection() != -1) {
                return SearchView.this.X(view, i, keyEvent);
            }
            if (SearchView.this.s.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.s.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.S(i, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    private static class o {
    }

    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.c.contains(x, y)) {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.y0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.C0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.B0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i2, String str) {
        int i3;
        String o2;
        try {
            String o3 = c0.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.B0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = c0.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.B0.getSuggestIntentData();
            }
            if (o4 != null && (o2 = c0.o(cursor, "suggest_intent_data_id")) != null) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            return C(str2, o4 == null ? null : Uri.parse(o4), c0.o(cursor, "suggest_intent_extra_data"), c0.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.C0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.s.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.S);
        getLocationInWindow(this.e0);
        int[] iArr = this.S;
        int i2 = iArr[1];
        int[] iArr2 = this.e0;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.o0 || this.g0 == null) {
            return charSequence;
        }
        int textSize = (int) (this.s.getTextSize() * 1.25d);
        this.g0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.g0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.B0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.B0.getVoiceSearchLaunchWebSearch() ? this.j0 : this.B0.getVoiceSearchLaunchRecognizer() ? this.k0 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.r0 || this.w0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private boolean Q(int i2, int i3, String str) {
        Cursor d2 = this.q0.d();
        if (d2 == null || !d2.moveToPosition(i2)) {
            return false;
        }
        O(D(d2, i3, str));
        return true;
    }

    private void b0() {
        post(this.D0);
    }

    private void c0(int i2) {
        Editable text = this.s.getText();
        Cursor d2 = this.q0.d();
        if (d2 == null) {
            return;
        }
        if (!d2.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence b2 = this.q0.b(d2);
        if (b2 != null) {
            setQuery(b2);
        } else {
            setQuery(text);
        }
    }

    private void e0() {
        boolean isEmpty = TextUtils.isEmpty(this.s.getText());
        this.B.setVisibility(!isEmpty || (this.o0 && !this.z0) ? 0 : 8);
        Drawable drawable = this.B.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.s;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(fe6.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(fe6.abc_search_view_preferred_width);
    }

    private void h0() {
        this.s.setThreshold(this.B0.getSuggestThreshold());
        this.s.setImeOptions(this.B0.getImeOptions());
        int inputType = this.B0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.B0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.s.setInputType(inputType);
        f41 f41Var = this.q0;
        if (f41Var != null) {
            f41Var.a(null);
        }
        if (this.B0.getSuggestAuthority() != null) {
            c0 c0Var = new c0(getContext(), this, this.B0, this.F0);
            this.q0 = c0Var;
            this.s.setAdapter(c0Var);
            ((c0) this.q0).x(this.t0 ? 2 : 1);
        }
    }

    private void i0() {
        this.w.setVisibility((N() && (this.y.getVisibility() == 0 || this.H.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z) {
        this.y.setVisibility((this.r0 && N() && hasFocus() && (z || !this.w0)) ? 0 : 8);
    }

    private void k0(boolean z) {
        this.p0 = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.s.getText());
        this.x.setVisibility(i3);
        j0(!isEmpty);
        this.t.setVisibility(z ? 8 : 0);
        if (this.f0.getDrawable() != null && !this.o0) {
            i2 = 0;
        }
        this.f0.setVisibility(i2);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z) {
        int i2 = 8;
        if (this.w0 && !L() && z) {
            this.y.setVisibility(8);
            i2 = 0;
        }
        this.H.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.s.setText(charSequence);
        this.s.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.L.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.u.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = k0.b(this);
            int dimensionPixelSize = this.o0 ? resources.getDimensionPixelSize(fe6.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(fe6.abc_dropdownitem_text_padding_left) : 0;
            this.s.getDropDownBackground().getPadding(rect);
            this.s.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.s.setDropDownWidth((((this.L.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        k.a(this.s);
    }

    public boolean L() {
        return this.p0;
    }

    void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.s.getText())) {
            this.s.setText("");
            this.s.requestFocus();
            this.s.setImeVisibility(true);
        } else if (this.o0) {
            clearFocus();
            k0(true);
        }
    }

    boolean S(int i2, int i3, String str) {
        Q(i2, 0, null);
        this.s.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i2) {
        c0(i2);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.s.requestFocus();
        this.s.setImeVisibility(true);
        View.OnClickListener onClickListener = this.n0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.s.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.B0 != null) {
            P(0, null, text.toString());
        }
        this.s.setImeVisibility(false);
        G();
    }

    boolean X(View view, int i2, KeyEvent keyEvent) {
        if (this.B0 != null && this.q0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.s.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.s.setSelection(i2 == 21 ? 0 : this.s.length());
                this.s.setListSelection(0);
                this.s.clearListSelection();
                this.s.b();
                return true;
            }
            if (i2 == 19) {
                this.s.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.s.getText();
        this.y0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        this.x0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.s.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.B0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.j0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.k0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // defpackage.fn0
    public void b() {
        if (this.z0) {
            return;
        }
        this.z0 = true;
        int imeOptions = this.s.getImeOptions();
        this.A0 = imeOptions;
        this.s.setImeOptions(imeOptions | 33554432);
        this.s.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.u0 = true;
        super.clearFocus();
        this.s.clearFocus();
        this.s.setImeVisibility(false);
        this.u0 = false;
    }

    public void d0(CharSequence charSequence, boolean z) {
        this.s.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.s;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.y0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // defpackage.fn0
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.s.setImeOptions(this.A0);
        this.z0 = false;
    }

    void f0() {
        int[] iArr = this.s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.s.getImeOptions();
    }

    public int getInputType() {
        return this.s.getInputType();
    }

    public int getMaxWidth() {
        return this.v0;
    }

    public CharSequence getQuery() {
        return this.s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.s0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.B0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.l0 : getContext().getText(this.B0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.i0;
    }

    int getSuggestionRowLayout() {
        return this.h0;
    }

    public f41 getSuggestionsAdapter() {
        return this.q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.D0);
        post(this.E0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.x, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            I(this.s, this.N);
            Rect rect = this.Q;
            Rect rect2 = this.N;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.M;
            if (pVar != null) {
                pVar.a(this.Q, this.N);
                return;
            }
            p pVar2 = new p(this.Q, this.N, this.s);
            this.M = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.x, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.v0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.v0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.v0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        k0(savedState.isIconified);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isIconified = L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.u0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.s.requestFocus(i2, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.C0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.o0 == z) {
            return;
        }
        this.o0 = z;
        k0(z);
        g0();
    }

    public void setImeOptions(int i2) {
        this.s.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.s.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.v0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.m0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.n0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.s0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.t0 = z;
        f41 f41Var = this.q0;
        if (f41Var instanceof c0) {
            ((c0) f41Var).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.B0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.w0 = K;
        if (K) {
            this.s.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.r0 = z;
        k0(L());
    }

    public void setSuggestionsAdapter(f41 f41Var) {
        this.q0 = f41Var;
        this.s.setAdapter(f41Var);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nc6.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.N = new Rect();
        this.Q = new Rect();
        this.S = new int[2];
        this.e0 = new int[2];
        this.D0 = new b();
        this.E0 = new c();
        this.F0 = new WeakHashMap();
        f fVar = new f();
        this.G0 = fVar;
        this.H0 = new g();
        h hVar = new h();
        this.I0 = hVar;
        i iVar = new i();
        this.J0 = iVar;
        j jVar = new j();
        this.K0 = jVar;
        this.L0 = new a();
        h0 v = h0.v(context, attributeSet, fo6.SearchView, i2, 0);
        k99.j0(this, context, fo6.SearchView, attributeSet, v.r(), i2, 0);
        LayoutInflater.from(context).inflate(v.n(fo6.SearchView_layout, zi6.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(zf6.search_src_text);
        this.s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.t = findViewById(zf6.search_edit_frame);
        View findViewById = findViewById(zf6.search_plate);
        this.u = findViewById;
        View findViewById2 = findViewById(zf6.submit_area);
        this.w = findViewById2;
        ImageView imageView = (ImageView) findViewById(zf6.search_button);
        this.x = imageView;
        ImageView imageView2 = (ImageView) findViewById(zf6.search_go_btn);
        this.y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(zf6.search_close_btn);
        this.B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(zf6.search_voice_btn);
        this.H = imageView4;
        ImageView imageView5 = (ImageView) findViewById(zf6.search_mag_icon);
        this.f0 = imageView5;
        k99.p0(findViewById, v.g(fo6.SearchView_queryBackground));
        k99.p0(findViewById2, v.g(fo6.SearchView_submitBackground));
        imageView.setImageDrawable(v.g(fo6.SearchView_searchIcon));
        imageView2.setImageDrawable(v.g(fo6.SearchView_goIcon));
        imageView3.setImageDrawable(v.g(fo6.SearchView_closeIcon));
        imageView4.setImageDrawable(v.g(fo6.SearchView_voiceIcon));
        imageView5.setImageDrawable(v.g(fo6.SearchView_searchIcon));
        this.g0 = v.g(fo6.SearchView_searchHintIcon);
        sn8.a(imageView, getResources().getString(rm6.abc_searchview_description_search));
        this.h0 = v.n(fo6.SearchView_suggestionRowLayout, zi6.abc_search_dropdown_item_icons_2line);
        this.i0 = v.n(fo6.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.L0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.H0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v.a(fo6.SearchView_iconifiedByDefault, true));
        int f2 = v.f(fo6.SearchView_android_maxWidth, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.l0 = v.p(fo6.SearchView_defaultQueryHint);
        this.s0 = v.p(fo6.SearchView_queryHint);
        int k2 = v.k(fo6.SearchView_android_imeOptions, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = v.k(fo6.SearchView_android_inputType, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(v.a(fo6.SearchView_android_focusable, true));
        v.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.j0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.k0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.L = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.o0);
        g0();
    }
}
