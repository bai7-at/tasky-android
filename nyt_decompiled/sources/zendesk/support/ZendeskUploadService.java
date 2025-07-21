package zendesk.support;

import defpackage.e17;
import defpackage.tm9;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
class ZendeskUploadService {
    private final UploadService uploadService;

    public ZendeskUploadService(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    void deleteAttachment(String str, tm9 tm9Var) {
        this.uploadService.deleteAttachment(str).enqueue(new e17(tm9Var));
    }

    void uploadAttachment(String str, File file, String str2, tm9 tm9Var) {
        this.uploadService.uploadAttachment(str, RequestBody.create(MediaType.parse(str2), file)).enqueue(new e17(tm9Var));
    }
}
