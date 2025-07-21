package zendesk.support;

import com.zendesk.logger.Logger;
import defpackage.mn0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import zendesk.core.BaseStorage;
import zendesk.core.MemoryCache;

/* loaded from: classes5.dex */
class ZendeskRequestStorage implements RequestStorage {
    private static final SimpleDateFormat HOURS_MINUTES_FORMAT = new SimpleDateFormat("mm:ss", Locale.ENGLISH);
    private static final long HOUR_IN_MILLIS = TimeUnit.HOURS.toMillis(1);
    private static final String LOG_TAG = "ZendeskRequestStorage";
    private static final String MEMORY_CACHE_MIGRATED_KEY = "zendesk_request_storage_memory_cache_migrated_flag";
    private static final String REQUESTS_DATA_KEY = "zendesk_request_storage_request_data_list";
    private static final String TIMESTAMP_KEY = "zendesk_request_storage_requests_data_cache_time";
    private final Object lock = new Object();
    private final MemoryCache memoryCache;
    private final RequestMigrator requestMigrator;
    private final BaseStorage storage;

    ZendeskRequestStorage(BaseStorage baseStorage, RequestMigrator requestMigrator, MemoryCache memoryCache) {
        this.storage = baseStorage;
        this.requestMigrator = requestMigrator;
        this.memoryCache = memoryCache;
    }

    private void checkForAndMigrateLegacyRequestData() {
        if (((Boolean) this.memoryCache.getOrDefault(MEMORY_CACHE_MIGRATED_KEY, Boolean.FALSE)).booleanValue()) {
            return;
        }
        List<RequestData> legacyRequests = this.requestMigrator.getLegacyRequests();
        if (mn0.h(legacyRequests)) {
            storeRequestData(legacyRequests);
            this.requestMigrator.clearLegacyRequestStorage();
            this.memoryCache.put(MEMORY_CACHE_MIGRATED_KEY, Boolean.TRUE);
        }
    }

    private static List<RequestData> updateRequests(List<RequestData> list, List<Request> list2) {
        HashMap hashMap = new HashMap(list.size() + list2.size());
        for (RequestData requestData : list) {
            hashMap.put(requestData.getId(), requestData);
        }
        for (Request request : list2) {
            if (hashMap.containsKey(request.getId())) {
                RequestData requestData2 = (RequestData) hashMap.get(request.getId());
                hashMap.put(requestData2.getId(), RequestData.create(requestData2.getId(), request.getCommentCount().intValue(), requestData2.getReadCommentCount()));
            } else {
                hashMap.put(request.getId(), RequestData.create(request));
            }
        }
        return new ArrayList(hashMap.values());
    }

    @Override // zendesk.support.RequestStorage
    public List<RequestData> getRequestData() {
        RequestDataList requestDataList;
        checkForAndMigrateLegacyRequestData();
        synchronized (this.lock) {
            requestDataList = (RequestDataList) this.storage.get(REQUESTS_DATA_KEY, RequestDataList.class);
        }
        return requestDataList != null ? requestDataList.requestDataList : new ArrayList(0);
    }

    @Override // zendesk.support.RequestStorage
    public boolean isRequestDataExpired() {
        String str;
        synchronized (this.lock) {
            str = this.storage.get(TIMESTAMP_KEY);
        }
        long parseLong = str == null ? 0L : Long.parseLong(str);
        boolean z = Math.abs(System.currentTimeMillis() - parseLong) > HOUR_IN_MILLIS;
        if (!z) {
            Logger.b(LOG_TAG, "Returning Read Requests from cache. Cached Read Requests will expire in %s", HOURS_MINUTES_FORMAT.format(Long.valueOf(parseLong)));
        }
        return z;
    }

    @Override // zendesk.support.RequestStorage
    public void markRequestAsRead(String str, int i) {
        synchronized (this.lock) {
            try {
                List<RequestData> requestData = getRequestData();
                ArrayList arrayList = new ArrayList(requestData.size());
                for (RequestData requestData2 : requestData) {
                    if (str.equals(requestData2.getId())) {
                        arrayList.add(RequestData.create(requestData2.getId(), i, i));
                    } else {
                        arrayList.add(requestData2);
                    }
                }
                storeRequestData(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zendesk.support.RequestStorage
    public void markRequestAsUnread(String str) {
        synchronized (this.lock) {
            try {
                List<RequestData> requestData = getRequestData();
                ArrayList arrayList = new ArrayList(requestData.size());
                for (RequestData requestData2 : requestData) {
                    if (str.equals(requestData2.getId())) {
                        arrayList.add(RequestData.create(str, requestData2.getCommentCount() + 1, requestData2.getReadCommentCount()));
                    } else {
                        arrayList.add(requestData2);
                    }
                }
                storeRequestData(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void storeRequestData(List<RequestData> list) {
        if (list == null) {
            return;
        }
        synchronized (this.lock) {
            this.storage.put(REQUESTS_DATA_KEY, new RequestDataList(list));
            this.storage.put(TIMESTAMP_KEY, Long.toString(System.currentTimeMillis()));
        }
    }

    @Override // zendesk.support.RequestStorage
    public void updateRequestData(List<Request> list) {
        synchronized (this.lock) {
            storeRequestData(updateRequests(getRequestData(), list));
        }
    }
}
