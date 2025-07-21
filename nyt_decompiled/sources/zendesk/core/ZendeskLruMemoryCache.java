package zendesk.core;

import android.util.LruCache;

/* loaded from: classes5.dex */
class ZendeskLruMemoryCache implements MemoryCache {
    public final LruCache<String, Object> cache;

    public ZendeskLruMemoryCache() {
        this(new LruCache(50));
    }

    @Override // zendesk.core.MemoryCache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // zendesk.core.MemoryCache
    public boolean contains(String str) {
        boolean z;
        synchronized (this) {
            z = this.cache.get(str) != null;
        }
        return z;
    }

    @Override // zendesk.core.MemoryCache
    public <T> T get(String str) {
        T t;
        synchronized (this) {
            t = (T) this.cache.get(str);
        }
        return t;
    }

    @Override // zendesk.core.MemoryCache
    public <T> T getOrDefault(String str, T t) {
        T t2 = (T) get(str);
        return t2 != null ? t2 : t;
    }

    @Override // zendesk.core.MemoryCache
    public void put(String str, Object obj) {
        synchronized (this) {
            this.cache.put(str, obj);
        }
    }

    @Override // zendesk.core.MemoryCache
    public void remove(String str) {
        synchronized (this) {
            this.cache.remove(str);
        }
    }

    ZendeskLruMemoryCache(LruCache<String, Object> lruCache) {
        this.cache = lruCache;
    }
}
