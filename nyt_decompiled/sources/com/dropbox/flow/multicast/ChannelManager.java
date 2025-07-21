package com.dropbox.flow.multicast;

import com.appsflyer.AppsFlyerProperties;
import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class ChannelManager {
    private final CoroutineScope a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final gt2 e;
    private final Flow f;
    private final Actor g;

    /* JADX INFO: Access modifiers changed from: private */
    final class Actor extends StoreRealActor {
        private final com.dropbox.flow.multicast.a g;
        private SharedFlowProducer h;
        private boolean i;
        private CompletableDeferred j;
        private final List k;
        final /* synthetic */ ChannelManager l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Actor(ChannelManager channelManager) {
            super(channelManager.a);
            com.dropbox.flow.multicast.a a;
            zq3.h(channelManager, "this$0");
            this.l = channelManager;
            a = c.a(channelManager.b);
            this.g = a;
            this.k = new ArrayList();
        }

        private final void k() {
            if (this.h == null) {
                SharedFlowProducer s = s();
                this.h = s;
                this.i = false;
                zq3.e(s);
                s.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object l(com.dropbox.flow.multicast.ChannelManager.a r5, defpackage.by0 r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.dropbox.flow.multicast.ChannelManager$Actor$addEntry$1
                if (r0 == 0) goto L13
                r0 = r6
                com.dropbox.flow.multicast.ChannelManager$Actor$addEntry$1 r0 = (com.dropbox.flow.multicast.ChannelManager$Actor$addEntry$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.dropbox.flow.multicast.ChannelManager$Actor$addEntry$1 r0 = new com.dropbox.flow.multicast.ChannelManager$Actor$addEntry$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.L$1
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r0.L$0
                com.dropbox.flow.multicast.ChannelManager$a r5 = (com.dropbox.flow.multicast.ChannelManager.a) r5
                kotlin.f.b(r6)
                goto L85
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.f.b(r6)
                java.util.List r6 = r4.k
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r2 = r6 instanceof java.util.Collection
                if (r2 == 0) goto L4f
                r2 = r6
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L4f
            L4d:
                r6 = r3
                goto L66
            L4f:
                java.util.Iterator r6 = r6.iterator()
            L53:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L4d
                java.lang.Object r2 = r6.next()
                com.dropbox.flow.multicast.ChannelManager$a r2 = (com.dropbox.flow.multicast.ChannelManager.a) r2
                boolean r2 = r2.e(r5)
                if (r2 == 0) goto L53
                r6 = 0
            L66:
                if (r6 == 0) goto Laf
                java.util.List r6 = r4.k
                r6.add(r5)
                com.dropbox.flow.multicast.a r6 = r4.g
                java.util.Collection r6 = r6.a()
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L9e
                com.dropbox.flow.multicast.a r4 = r4.g
                java.util.Collection r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L85:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto Lac
                java.lang.Object r6 = r4.next()
                com.dropbox.flow.multicast.ChannelManager$b$b$c r6 = (com.dropbox.flow.multicast.ChannelManager.b.AbstractC0166b.c) r6
                r0.L$0 = r5
                r0.L$1 = r4
                r0.label = r3
                java.lang.Object r6 = r5.c(r6, r0)
                if (r6 != r1) goto L85
                return r1
            L9e:
                kotlinx.coroutines.CompletableDeferred r4 = r4.j
                if (r4 != 0) goto La3
                goto Lac
            La3:
                ww8 r5 = defpackage.ww8.a
                boolean r4 = r4.complete(r5)
                defpackage.cc0.a(r4)
            Lac:
                ww8 r4 = defpackage.ww8.a
                return r4
            Laf:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r5)
                java.lang.String r5 = " is already in the list."
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.ChannelManager.Actor.l(com.dropbox.flow.multicast.ChannelManager$a, by0):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m(com.dropbox.flow.multicast.ChannelManager.b.a r6, defpackage.by0 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.dropbox.flow.multicast.ChannelManager$Actor$doAdd$1
                if (r0 == 0) goto L13
                r0 = r7
                com.dropbox.flow.multicast.ChannelManager$Actor$doAdd$1 r0 = (com.dropbox.flow.multicast.ChannelManager$Actor$doAdd$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.dropbox.flow.multicast.ChannelManager$Actor$doAdd$1 r0 = new com.dropbox.flow.multicast.ChannelManager$Actor$doAdd$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r5 = r0.L$1
                r6 = r5
                com.dropbox.flow.multicast.ChannelManager$b$a r6 = (com.dropbox.flow.multicast.ChannelManager.b.a) r6
                java.lang.Object r5 = r0.L$0
                com.dropbox.flow.multicast.ChannelManager$Actor r5 = (com.dropbox.flow.multicast.ChannelManager.Actor) r5
                kotlin.f.b(r7)
                goto L6b
            L32:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3a:
                kotlin.f.b(r7)
                boolean r7 = r6.b()
                if (r7 == 0) goto L4e
                com.dropbox.flow.multicast.ChannelManager r7 = r5.l
                boolean r7 = com.dropbox.flow.multicast.ChannelManager.d(r7)
                if (r7 == 0) goto L4c
                goto L4e
            L4c:
                r7 = 0
                goto L4f
            L4e:
                r7 = r3
            L4f:
                if (r7 == 0) goto L77
                com.dropbox.flow.multicast.ChannelManager$a r7 = new com.dropbox.flow.multicast.ChannelManager$a
                kotlinx.coroutines.channels.SendChannel r2 = r6.a()
                boolean r4 = r6.b()
                r7.<init>(r2, r4)
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r7 = r5.l(r7, r0)
                if (r7 != r1) goto L6b
                return r1
            L6b:
                boolean r6 = r6.b()
                if (r6 != 0) goto L74
                r5.k()
            L74:
                ww8 r5 = defpackage.ww8.a
                return r5
            L77:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "cannot add a piggyback only downstream when piggybackDownstream is disabled"
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.ChannelManager.Actor.m(com.dropbox.flow.multicast.ChannelManager$b$a, by0):java.lang.Object");
        }

        private final void n(b.AbstractC0166b.a aVar) {
            this.i = true;
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).b(aVar.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object o(com.dropbox.flow.multicast.ChannelManager.b.AbstractC0166b.c r6, defpackage.by0 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.dropbox.flow.multicast.ChannelManager$Actor$doDispatchValue$1
                if (r0 == 0) goto L13
                r0 = r7
                com.dropbox.flow.multicast.ChannelManager$Actor$doDispatchValue$1 r0 = (com.dropbox.flow.multicast.ChannelManager$Actor$doDispatchValue$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.dropbox.flow.multicast.ChannelManager$Actor$doDispatchValue$1 r0 = new com.dropbox.flow.multicast.ChannelManager$Actor$doDispatchValue$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L49
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r5 = r0.L$1
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r6 = r0.L$0
                com.dropbox.flow.multicast.ChannelManager$b$b$c r6 = (com.dropbox.flow.multicast.ChannelManager.b.AbstractC0166b.c) r6
                kotlin.f.b(r7)
                goto L80
            L34:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3c:
                java.lang.Object r5 = r0.L$1
                r6 = r5
                com.dropbox.flow.multicast.ChannelManager$b$b$c r6 = (com.dropbox.flow.multicast.ChannelManager.b.AbstractC0166b.c) r6
                java.lang.Object r5 = r0.L$0
                com.dropbox.flow.multicast.ChannelManager$Actor r5 = (com.dropbox.flow.multicast.ChannelManager.Actor) r5
                kotlin.f.b(r7)
                goto L63
            L49:
                kotlin.f.b(r7)
                com.dropbox.flow.multicast.ChannelManager r7 = r5.l
                gt2 r7 = com.dropbox.flow.multicast.ChannelManager.c(r7)
                java.lang.Object r2 = r6.b()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = r7.invoke(r2, r0)
                if (r7 != r1) goto L63
                return r1
            L63:
                com.dropbox.flow.multicast.a r7 = r5.g
                r7.b(r6)
                r5.i = r4
                com.dropbox.flow.multicast.a r7 = r5.g
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L78
                kotlinx.coroutines.CompletableDeferred r7 = r6.a()
                r5.j = r7
            L78:
                java.util.List r5 = r5.k
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L80:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L99
                java.lang.Object r7 = r5.next()
                com.dropbox.flow.multicast.ChannelManager$a r7 = (com.dropbox.flow.multicast.ChannelManager.a) r7
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r7 = r7.c(r6, r0)
                if (r7 != r1) goto L80
                return r1
            L99:
                ww8 r5 = defpackage.ww8.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.ChannelManager.Actor.o(com.dropbox.flow.multicast.ChannelManager$b$b$c, by0):java.lang.Object");
        }

        private final void p(SharedFlowProducer sharedFlowProducer) {
            if (this.h != sharedFlowProducer) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<a> list = this.k;
            ChannelManager channelManager = this.l;
            for (a aVar : list) {
                if (aVar.d()) {
                    if (this.i) {
                        arrayList2.add(aVar);
                    } else if (channelManager.c) {
                        arrayList.add(aVar);
                    } else {
                        aVar.a();
                    }
                } else if (channelManager.c) {
                    arrayList.add(aVar);
                } else {
                    aVar.a();
                }
            }
            this.k.clear();
            this.k.addAll(arrayList2);
            this.k.addAll(arrayList);
            this.h = null;
            if (arrayList2.isEmpty()) {
                return;
            }
            k();
        }

        private final Object q(SendChannel sendChannel, by0 by0Var) {
            SharedFlowProducer sharedFlowProducer;
            Iterator it2 = this.k.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (((a) it2.next()).f(sendChannel)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                this.k.remove(i);
                if (!this.l.d && this.k.isEmpty() && (sharedFlowProducer = this.h) != null) {
                    Object e = sharedFlowProducer.e(by0Var);
                    return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
                }
            }
            return ww8.a;
        }

        private final SharedFlowProducer s() {
            return new SharedFlowProducer(this.l.a, this.l.f, new ChannelManager$Actor$newProducer$1(this));
        }

        @Override // com.dropbox.flow.multicast.StoreRealActor
        public void f() {
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a();
            }
            this.k.clear();
            SharedFlowProducer sharedFlowProducer = this.h;
            if (sharedFlowProducer == null) {
                return;
            }
            sharedFlowProducer.d();
        }

        @Override // com.dropbox.flow.multicast.StoreRealActor
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Object e(b bVar, by0 by0Var) {
            if (bVar instanceof b.a) {
                Object m = m((b.a) bVar, by0Var);
                return m == kotlin.coroutines.intrinsics.a.h() ? m : ww8.a;
            }
            if (bVar instanceof b.c) {
                Object q = q(((b.c) bVar).a(), by0Var);
                return q == kotlin.coroutines.intrinsics.a.h() ? q : ww8.a;
            }
            if (bVar instanceof b.AbstractC0166b.c) {
                Object o = o((b.AbstractC0166b.c) bVar, by0Var);
                return o == kotlin.coroutines.intrinsics.a.h() ? o : ww8.a;
            }
            if (bVar instanceof b.AbstractC0166b.a) {
                n((b.AbstractC0166b.a) bVar);
            } else if (bVar instanceof b.AbstractC0166b.C0167b) {
                p(((b.AbstractC0166b.C0167b) bVar).a());
            }
            return ww8.a;
        }
    }

    public static final class a {
        private final SendChannel a;
        private final boolean b;
        private boolean c;

        public a(SendChannel sendChannel, boolean z) {
            zq3.h(sendChannel, AppsFlyerProperties.CHANNEL);
            this.a = sendChannel;
            this.b = z;
            this.c = !z;
        }

        public final void a() {
            SendChannel.DefaultImpls.close$default(this.a, null, 1, null);
        }

        public final void b(Throwable th) {
            zq3.h(th, "error");
            this.c = false;
            this.a.close(th);
        }

        public final Object c(b.AbstractC0166b.c cVar, by0 by0Var) {
            this.c = false;
            Object send = this.a.send(cVar, by0Var);
            return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
        }

        public final boolean d() {
            return this.c;
        }

        public final boolean e(a aVar) {
            zq3.h(aVar, "entry");
            return this.a == aVar.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public final boolean f(SendChannel sendChannel) {
            zq3.h(sendChannel, AppsFlyerProperties.CHANNEL);
            return this.a == sendChannel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "ChannelEntry(channel=" + this.a + ", piggybackOnly=" + this.b + ')';
        }
    }

    public static abstract class b {

        public static final class a extends b {
            private final SendChannel a;
            private final boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SendChannel sendChannel, boolean z) {
                super(null);
                zq3.h(sendChannel, AppsFlyerProperties.CHANNEL);
                this.a = sendChannel;
                this.b = z;
            }

            public final SendChannel a() {
                return this.a;
            }

            public final boolean b() {
                return this.b;
            }
        }

        /* renamed from: com.dropbox.flow.multicast.ChannelManager$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0166b extends b {

            /* renamed from: com.dropbox.flow.multicast.ChannelManager$b$b$a */
            public static final class a extends AbstractC0166b {
                private final Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(null);
                    zq3.h(th, "error");
                    this.a = th;
                }

                public final Throwable a() {
                    return this.a;
                }
            }

            /* renamed from: com.dropbox.flow.multicast.ChannelManager$b$b$b, reason: collision with other inner class name */
            public static final class C0167b extends AbstractC0166b {
                private final SharedFlowProducer a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0167b(SharedFlowProducer sharedFlowProducer) {
                    super(null);
                    zq3.h(sharedFlowProducer, "producer");
                    this.a = sharedFlowProducer;
                }

                public final SharedFlowProducer a() {
                    return this.a;
                }
            }

            /* renamed from: com.dropbox.flow.multicast.ChannelManager$b$b$c */
            public static final class c extends AbstractC0166b {
                private final Object a;
                private final CompletableDeferred b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Object obj, CompletableDeferred completableDeferred) {
                    super(null);
                    zq3.h(completableDeferred, "delivered");
                    this.a = obj;
                    this.b = completableDeferred;
                }

                public final CompletableDeferred a() {
                    return this.b;
                }

                public final Object b() {
                    return this.a;
                }
            }

            public /* synthetic */ AbstractC0166b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0166b() {
                super(null);
            }
        }

        public static final class c extends b {
            private final SendChannel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SendChannel sendChannel) {
                super(null);
                zq3.h(sendChannel, AppsFlyerProperties.CHANNEL);
                this.a = sendChannel;
            }

            public final SendChannel a() {
                return this.a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ChannelManager(CoroutineScope coroutineScope, int i, boolean z, boolean z2, gt2 gt2Var, Flow flow) {
        zq3.h(coroutineScope, "scope");
        zq3.h(gt2Var, "onEach");
        zq3.h(flow, "upstream");
        this.a = coroutineScope;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = gt2Var;
        this.f = flow;
        if (!(!z2 || i > 0)) {
            throw new IllegalArgumentException("Must set bufferSize > 0 if keepUpstreamAlive is enabled");
        }
        this.g = new Actor(this);
    }

    public final Object g(SendChannel sendChannel, boolean z, by0 by0Var) {
        Object g = this.g.g(new b.a(sendChannel, z), by0Var);
        return g == kotlin.coroutines.intrinsics.a.h() ? g : ww8.a;
    }

    public final Object h(by0 by0Var) {
        Object c = this.g.c(by0Var);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public final Object i(SendChannel sendChannel, by0 by0Var) {
        Object g = this.g.g(new b.c(sendChannel), by0Var);
        return g == kotlin.coroutines.intrinsics.a.h() ? g : ww8.a;
    }
}
