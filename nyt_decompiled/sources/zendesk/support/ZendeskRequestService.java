package zendesk.support;

import com.amazonaws.util.DateUtils;
import defpackage.e17;
import defpackage.tm9;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes5.dex */
class ZendeskRequestService {
    private final DateFormat iso8601;
    private final e17.b requestExtractor;
    private final RequestService requestService;
    private final e17.b requestsExtractor;

    ZendeskRequestService(RequestService requestService) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US);
        this.iso8601 = simpleDateFormat;
        this.requestsExtractor = new e17.b() { // from class: zendesk.support.ZendeskRequestService.3
            @Override // e17.b
            public List<Request> extract(RequestsResponse requestsResponse) {
                Map agentMap = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
                ArrayList arrayList = new ArrayList();
                Iterator<Request> it2 = requestsResponse.getRequests().iterator();
                while (it2.hasNext()) {
                    arrayList.add(ZendeskRequestService.updateLastCommentingAgents(it2.next(), agentMap));
                }
                return arrayList;
            }
        };
        this.requestExtractor = new e17.b() { // from class: zendesk.support.ZendeskRequestService.4
            @Override // e17.b
            public Request extract(RequestResponse requestResponse) {
                return ZendeskRequestService.updateLastCommentingAgents(requestResponse.getRequest(), ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents()));
            }
        };
        this.requestService = requestService;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User user : list) {
            hashMap.put(user.getId(), new User(user.getId(), user.getName(), user.getPhoto(), true, -1L, null, null));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        Iterator<Long> it2 = request.getLastCommentingAgentsIds().iterator();
        while (it2.hasNext()) {
            arrayList.add(map.get(it2.next()));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }

    void addComment(String str, EndUserComment endUserComment, tm9 tm9Var) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).enqueue(new e17(tm9Var, new e17.b() { // from class: zendesk.support.ZendeskRequestService.2
            @Override // e17.b
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void createRequest(String str, CreateRequest createRequest, tm9 tm9Var) {
        this.requestService.createRequest(str, new CreateRequestWrapper(createRequest)).enqueue(new e17(tm9Var, new e17.b() { // from class: zendesk.support.ZendeskRequestService.1
            @Override // e17.b
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    void getAllRequests(String str, String str2, tm9 tm9Var) {
        this.requestService.getAllRequests(str, str2).enqueue(new e17(tm9Var, this.requestsExtractor));
    }

    void getComments(String str, tm9 tm9Var) {
        this.requestService.getComments(str).enqueue(new e17(tm9Var));
    }

    void getCommentsSince(String str, Date date, boolean z, tm9 tm9Var) {
        this.requestService.getCommentsSince(str, this.iso8601.format(date), z ? "agent" : null).enqueue(new e17(tm9Var));
    }

    void getRequest(String str, String str2, tm9 tm9Var) {
        this.requestService.getRequest(str, str2).enqueue(new e17(tm9Var, this.requestExtractor));
    }

    void getTicketFormsById(String str, tm9 tm9Var) {
        this.requestService.getTicketFormsById(str, "ticket_fields").enqueue(new e17(tm9Var));
    }

    void getAllRequests(String str, String str2, String str3, tm9 tm9Var) {
        this.requestService.getManyRequests(str, str2, str3).enqueue(new e17(tm9Var, this.requestsExtractor));
    }
}
