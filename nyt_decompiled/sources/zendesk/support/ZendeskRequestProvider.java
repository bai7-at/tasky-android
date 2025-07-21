package zendesk.support;

import com.zendesk.logger.Logger;
import defpackage.lh4;
import defpackage.mn0;
import defpackage.r48;
import defpackage.tm9;
import defpackage.y22;
import defpackage.z22;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;

/* loaded from: classes5.dex */
final class ZendeskRequestProvider implements RequestProvider {
    private static final String ALL_REQUEST_STATUSES = "new,open,pending,hold,solved,closed";
    private static final String GET_REQUESTS_SIDE_LOAD = "public_updated_at,last_commenting_agents,last_comment,first_comment";
    private static final String LOG_TAG = "ZendeskRequestProvider";
    private static final int MAX_TICKET_FIELDS = 5;
    private final AuthenticationProvider authenticationProvider;
    private final SupportBlipsProvider blipsProvider;
    private final SupportSdkMetadata metadata;
    private final ZendeskRequestService requestService;
    private final RequestSessionCache requestSessionCache;
    private final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    private final ZendeskTracker zendeskTracker;

    ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider, RequestStorage requestStorage, RequestSessionCache requestSessionCache, ZendeskTracker zendeskTracker, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider;
        this.requestStorage = requestStorage;
        this.requestSessionCache = requestSessionCache;
        this.zendeskTracker = zendeskTracker;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final tm9 tm9Var) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.7
            @Override // defpackage.tm9
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() == null || request.getCommentCount() == null) {
                    Logger.i(ZendeskRequestProvider.LOG_TAG, "The ID and / or comment count was missing. Cannot store comment totalUpdates.", new Object[0]);
                } else {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                }
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(request.getLastComment());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List<String> a = mn0.a(createRequest.getTags(), supportSdkSettings.getContactZendeskTags());
        if (mn0.h(a)) {
            Logger.b(LOG_TAG, "Adding tags to feedback...", new Object[0]);
            createRequest.setTags(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(tm9 tm9Var) {
        Logger.b(LOG_TAG, "Conversations disabled, this feature is not available on your plan or was disabled.", new Object[0]);
        if (tm9Var != null) {
            tm9Var.onError(new z22("Access Denied"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData requestData : list) {
            int unreadComments = requestData.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(requestData.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<TicketForm> convertTicketFormResponse(List<RawTicketForm> list, List<Object> list2) {
        ArrayList arrayList = new ArrayList();
        Map<Long, Object> createTicketFieldMap = createTicketFieldMap(list2);
        Iterator<RawTicketForm> it2 = list.iterator();
        while (it2.hasNext()) {
            lh4.a(it2.next());
            arrayList.add(createTicketFormFromResponse(null, createTicketFieldMap));
        }
        return arrayList;
    }

    private static Map<Long, Object> createTicketFieldMap(List<Object> list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator<Object> it2 = list.iterator();
        if (!it2.hasNext()) {
            return hashMap;
        }
        lh4.a(it2.next());
        throw null;
    }

    private static TicketForm createTicketFormFromResponse(RawTicketForm rawTicketForm, Map<Long, Object> map) {
        new ArrayList();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final tm9 tm9Var) {
        if (r48.d(str)) {
            str = ALL_REQUEST_STATUSES;
        }
        ZendeskCallbackSuccess<List<Request>> zendeskCallbackSuccess = new ZendeskCallbackSuccess<List<Request>>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.3
            @Override // defpackage.tm9
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(list);
                }
            }
        };
        if (authenticationType != AuthenticationType.ANONYMOUS) {
            this.requestService.getAllRequests(str, GET_REQUESTS_SIDE_LOAD, zendeskCallbackSuccess);
            return;
        }
        List<RequestData> requestData = this.requestStorage.getRequestData();
        ArrayList arrayList = new ArrayList(requestData.size());
        Iterator<RequestData> it2 = requestData.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getId());
        }
        if (!mn0.f(arrayList)) {
            this.requestService.getAllRequests(r48.f(arrayList), str, GET_REQUESTS_SIDE_LOAD, zendeskCallbackSuccess);
            return;
        }
        Logger.i(LOG_TAG, "getAllRequestsInternal: There are no requests to fetch", new Object[0]);
        if (tm9Var != null) {
            tm9Var.onSuccess(new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final tm9 tm9Var) {
        ZendeskCallbackSuccess<Request> zendeskCallbackSuccess = new ZendeskCallbackSuccess<Request>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.2
            @Override // defpackage.tm9
            public void onSuccess(Request request) {
                if (request == null || request.getId() == null) {
                    onError(new z22("The request was created, but the ID is unknown."));
                    return;
                }
                ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(request);
                }
            }
        };
        if (authenticationType != AuthenticationType.ANONYMOUS || identity == null || !(identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest(null, createRequest, zendeskCallbackSuccess);
        } else {
            this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, zendeskCallbackSuccess);
        }
    }

    public void addComment(final String str, final EndUserComment endUserComment, final tm9 tm9Var) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.8
            @Override // defpackage.tm9
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str, endUserComment, tm9Var);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(tm9Var);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void createRequest(final CreateRequest createRequest, final tm9 tm9Var) {
        if (createRequest != null) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.1
                @Override // defpackage.tm9
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                    ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                    ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), tm9Var);
                }
            });
            return;
        }
        Logger.d(LOG_TAG, "configuration is invalid: request null", new Object[0]);
        if (tm9Var != null) {
            tm9Var.onError(new z22("configuration is invalid: request null"));
        }
    }

    public void getAllRequests(tm9 tm9Var) {
        getRequests(null, tm9Var);
    }

    public void getComments(final String str, final tm9 tm9Var) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.5
            @Override // defpackage.tm9
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, tm9Var);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(tm9Var);
                }
            }
        });
    }

    public void getCommentsSince(final String str, final Date date, final boolean z, final tm9 tm9Var) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.6
            @Override // defpackage.tm9
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str, date, z, tm9Var);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(tm9Var);
                }
            }
        });
    }

    public void getRequest(final String str, final tm9 tm9Var) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.9
            @Override // defpackage.tm9
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, ZendeskRequestProvider.GET_REQUESTS_SIDE_LOAD, tm9Var);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(tm9Var);
                }
            }
        });
    }

    public void getRequests(final String str, final tm9 tm9Var) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.4
            @Override // defpackage.tm9
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), tm9Var);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(tm9Var);
                }
            }
        });
    }

    public void getTicketFormsById(List<Long> list, final tm9 tm9Var) {
        if (mn0.f(list)) {
            if (tm9Var != null) {
                tm9Var.onError(new z22("Ticket forms must at least contain 1 Id"));
                return;
            }
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
            Logger.b(LOG_TAG, "Maximum number of allowed ticket fields: %d.", 5);
        } else {
            arrayList.addAll(list);
        }
        if (!this.requestSessionCache.containsAllTicketForms(arrayList)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.10
                @Override // defpackage.tm9
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (supportSdkSettings.isTicketFormSupportAvailable()) {
                        ZendeskRequestProvider.this.requestService.getTicketFormsById(r48.g(arrayList), new ZendeskCallbackSuccess<RawTicketFormResponse>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.10.1
                            @Override // defpackage.tm9
                            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                                lh4.a(obj);
                                onSuccess((RawTicketFormResponse) null);
                            }

                            public void onSuccess(RawTicketFormResponse rawTicketFormResponse) {
                                throw null;
                            }
                        });
                    } else {
                        tm9 tm9Var2 = tm9Var;
                        if (tm9Var2 != null) {
                            tm9Var2.onError(new z22("Ticket form support disabled."));
                        }
                    }
                }
            });
        } else if (tm9Var != null) {
            tm9Var.onSuccess(this.requestSessionCache.getTicketFormsById(arrayList));
        }
    }

    public void getUpdatesForDevice(final tm9 tm9Var) {
        if (this.requestStorage.isRequestDataExpired()) {
            this.settingsProvider.getSettings(new tm9() { // from class: zendesk.support.ZendeskRequestProvider.11
                @Override // defpackage.tm9
                public void onError(y22 y22Var) {
                    tm9Var.onError(y22Var);
                }

                @Override // defpackage.tm9
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.this.getAllRequestsInternal(null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(tm9Var) { // from class: zendesk.support.ZendeskRequestProvider.11.1
                            @Override // defpackage.tm9
                            public void onSuccess(List<Request> list) {
                                tm9Var.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    } else {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(tm9Var);
                    }
                }
            });
        } else {
            tm9Var.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        }
    }

    public void markRequestAsRead(String str, int i) {
        this.requestStorage.markRequestAsRead(str, i);
    }

    @Override // zendesk.support.RequestProvider
    public void markRequestAsUnread(String str) {
        this.requestStorage.markRequestAsUnread(str);
    }
}
