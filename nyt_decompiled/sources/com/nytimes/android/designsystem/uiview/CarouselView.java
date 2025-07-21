package com.nytimes.android.designsystem.uiview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.core.view.ViewGroupKt;
import defpackage.ak7;
import defpackage.b22;
import defpackage.ja3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.d;

/* loaded from: classes4.dex */
public final class CarouselView extends HorizontalScrollView {
    private ss2 a;
    private boolean b;
    private ss2 c;
    private ss2 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Alignment {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment START = new Alignment("START", 0);
        public static final Alignment CENTER = new Alignment("CENTER", 1);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{START, CENTER};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Alignment(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        this.d = new ss2() { // from class: com.nytimes.android.designsystem.uiview.CarouselView$couldBeTargetView$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(View view) {
                zq3.h(view, "it");
                return Boolean.TRUE;
            }
        };
        Context context2 = getContext();
        zq3.g(context2, "getContext(...)");
        setOnTouchListener(new ja3(context2, new ss2() { // from class: com.nytimes.android.designsystem.uiview.CarouselView.1
            public final Boolean b(float f) {
                if (CarouselView.this.getPagedScroll()) {
                    final int paddingLeft = ViewGroupKt.a(CarouselView.this, 0).getPaddingLeft();
                    if (f < 0.0f) {
                        final CarouselView carouselView = CarouselView.this;
                        CarouselView.b(carouselView, null, new qs2() { // from class: com.nytimes.android.designsystem.uiview.CarouselView.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Integer mo865invoke() {
                                return Integer.valueOf(CarouselView.this.getMeasuredWidth() - paddingLeft);
                            }
                        }, 1, null);
                    } else {
                        CarouselView.b(CarouselView.this, null, new qs2() { // from class: com.nytimes.android.designsystem.uiview.CarouselView.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Integer mo865invoke() {
                                return Integer.valueOf(paddingLeft);
                            }
                        }, 1, null);
                    }
                }
                ss2 flingListener = CarouselView.this.getFlingListener();
                if (flingListener != null) {
                    flingListener.invoke(Float.valueOf(f));
                }
                return Boolean.valueOf(CarouselView.this.getPagedScroll());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        }, new qs2() { // from class: com.nytimes.android.designsystem.uiview.CarouselView.2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                if (CarouselView.this.getPagedScroll()) {
                    final CarouselView carouselView = CarouselView.this;
                    CarouselView.b(carouselView, null, new qs2() { // from class: com.nytimes.android.designsystem.uiview.CarouselView.2.1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final Integer mo865invoke() {
                            return Integer.valueOf(CarouselView.this.getMeasuredWidth() / 2);
                        }
                    }, 1, null);
                }
                return Boolean.valueOf(CarouselView.this.getPagedScroll());
            }
        }));
    }

    private final void a(Alignment alignment, qs2 qs2Var) {
        Object obj;
        int paddingLeft;
        View a2 = ViewGroupKt.a(this, 0);
        zq3.f(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) a2;
        ak7 b = ViewGroupKt.b(viewGroup);
        int scrollX = getScrollX() + ((Number) qs2Var.mo865invoke()).intValue();
        Iterator it2 = b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            View view = (View) obj;
            if (view.getRight() > scrollX && ((Boolean) this.d.invoke(view)).booleanValue()) {
                break;
            }
        }
        View view2 = (View) obj;
        if (view2 == null) {
            view2 = (View) d.q(b);
        }
        int i = a.a[alignment.ordinal()];
        if (i == 1) {
            paddingLeft = viewGroup.getPaddingLeft();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            paddingLeft = (getMeasuredWidth() - view2.getMeasuredWidth()) / 2;
        }
        smoothScrollTo(view2.getLeft() - paddingLeft, 0);
    }

    static /* synthetic */ void b(CarouselView carouselView, Alignment alignment, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.CENTER;
        }
        carouselView.a(alignment, qs2Var);
    }

    private final int getCarouselWidth() {
        return getMeasuredWidth();
    }

    public final ss2 getCouldBeTargetView() {
        return this.d;
    }

    public final ss2 getFlingListener() {
        return this.c;
    }

    public final boolean getPagedScroll() {
        return this.b;
    }

    public final ss2 getScrollListener() {
        return this.a;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ss2 ss2Var = this.a;
        if (ss2Var != null) {
            ss2Var.invoke(Integer.valueOf(i));
        }
    }

    public final void setCouldBeTargetView(ss2 ss2Var) {
        zq3.h(ss2Var, "<set-?>");
        this.d = ss2Var;
    }

    public final void setFlingListener(ss2 ss2Var) {
        this.c = ss2Var;
    }

    public final void setPagedScroll(boolean z) {
        this.b = z;
    }

    public final void setScrollListener(ss2 ss2Var) {
        this.a = ss2Var;
    }
}
