package zendesk.support;

import defpackage.tm9;
import java.io.File;

/* loaded from: classes5.dex */
class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    public void deleteAttachment(String str, tm9 tm9Var) {
        this.uploadService.deleteAttachment(str, tm9Var);
    }

    @Override // zendesk.support.UploadProvider
    public void uploadAttachment(String str, File file, String str2, final tm9 tm9Var) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(tm9Var) { // from class: zendesk.support.ZendeskUploadProvider.1
            @Override // defpackage.tm9
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                tm9 tm9Var2 = tm9Var;
                if (tm9Var2 != null) {
                    tm9Var2.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
