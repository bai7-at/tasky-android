package zendesk.core;

import defpackage.e17;
import defpackage.mn0;
import defpackage.r48;
import defpackage.tm9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
class ZendeskUserProvider implements UserProvider {
    private final UserService userService;
    private static final e17.b USER_EXTRACTOR = new e17.b() { // from class: zendesk.core.ZendeskUserProvider.6
        @Override // e17.b
        public User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private static final e17.b FIELDS_EXTRACTOR = new e17.b() { // from class: zendesk.core.ZendeskUserProvider.7
        @Override // e17.b
        public List<UserField> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final e17.b FIELDS_MAP_EXTRACTOR = new e17.b() { // from class: zendesk.core.ZendeskUserProvider.8
        @Override // e17.b
        public Map<String, String> extract(UserResponse userResponse) {
            return (userResponse == null || userResponse.getUser() == null) ? mn0.c(new HashMap()) : userResponse.getUser().getUserFields();
        }
    };
    private static final e17.b TAGS_EXTRACTOR = new e17.b() { // from class: zendesk.core.ZendeskUserProvider.9
        @Override // e17.b
        public List<String> extract(UserResponse userResponse) {
            return (userResponse == null || userResponse.getUser() == null) ? mn0.b(new ArrayList()) : userResponse.getUser().getTags();
        }
    };

    ZendeskUserProvider(UserService userService) {
        this.userService = userService;
    }

    @Override // zendesk.core.UserProvider
    public void addTags(List<String> list, final tm9 tm9Var) {
        this.userService.addTags(new UserTagRequest(mn0.d(list))).enqueue(new e17(new PassThroughErrorZendeskCallback<List<String>>(tm9Var) { // from class: zendesk.core.ZendeskUserProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(List<String> list2) {
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void deleteTags(List<String> list, final tm9 tm9Var) {
        this.userService.deleteTags(r48.f(mn0.d(list))).enqueue(new e17(new PassThroughErrorZendeskCallback<List<String>>(tm9Var) { // from class: zendesk.core.ZendeskUserProvider.2
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(List<String> list2) {
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUser(final tm9 tm9Var) {
        this.userService.getUser().enqueue(new e17(new PassThroughErrorZendeskCallback<User>(tm9Var) { // from class: zendesk.core.ZendeskUserProvider.5
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(User user) {
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(user);
                }
            }
        }, USER_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUserFields(final tm9 tm9Var) {
        this.userService.getUserFields().enqueue(new e17(new PassThroughErrorZendeskCallback<List<UserField>>(tm9Var) { // from class: zendesk.core.ZendeskUserProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(List<UserField> list) {
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(list);
                }
            }
        }, FIELDS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void setUserFields(Map<String, String> map, final tm9 tm9Var) {
        this.userService.setUserFields(new UserFieldRequest(map)).enqueue(new e17(new PassThroughErrorZendeskCallback<Map<String, String>>(tm9Var) { // from class: zendesk.core.ZendeskUserProvider.4
            @Override // zendesk.core.PassThroughErrorZendeskCallback, defpackage.tm9
            public void onSuccess(Map<String, String> map2) {
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(map2);
                }
            }
        }, FIELDS_MAP_EXTRACTOR));
    }
}
