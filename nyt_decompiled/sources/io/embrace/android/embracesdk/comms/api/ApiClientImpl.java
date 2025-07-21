package io.embrace.android.embracesdk.comms.api;

import defpackage.gm0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zj8;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.ApiResponse;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.f;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class ApiClientImpl implements ApiClient {
    private final InternalEmbraceLogger logger;

    public ApiClientImpl(InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.logger = internalEmbraceLogger;
    }

    private final ApiResponse executeHttpRequest(EmbraceConnection embraceConnection) {
        try {
            int readHttpResponseCode = readHttpResponseCode(embraceConnection);
            Map<String, String> readHttpResponseHeaders = readHttpResponseHeaders(embraceConnection);
            if (readHttpResponseCode == -1) {
                return new ApiResponse.Incomplete(new IllegalStateException("Connection failed or unexpected response code"));
            }
            if (readHttpResponseCode == 200) {
                return new ApiResponse.Success(readResponseBodyAsString(embraceConnection.getInputStream()), readHttpResponseHeaders);
            }
            if (readHttpResponseCode == 304) {
                return ApiResponse.NotModified.INSTANCE;
            }
            if (readHttpResponseCode == 413) {
                return ApiResponse.PayloadTooLarge.INSTANCE;
            }
            if (readHttpResponseCode != 429) {
                return new ApiResponse.Failure(readHttpResponseCode, readHttpResponseHeaders);
            }
            Endpoint endpoint = embraceConnection.getURL().endpoint();
            String str = readHttpResponseHeaders.get("Retry-After");
            return new ApiResponse.TooManyRequests(endpoint, str != null ? h.n(str) : null);
        } catch (Throwable th) {
            return new ApiResponse.Incomplete(new IllegalStateException("Error occurred during HTTP request execution", th));
        }
    }

    private final int readHttpResponseCode(EmbraceConnection embraceConnection) {
        Integer num;
        try {
            num = Integer.valueOf(embraceConnection.getResponseCode());
        } catch (IOException unused) {
            this.logger.log("Connection failed or unexpected response code", InternalEmbraceLogger.Severity.INFO, null, true);
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final Map<String, String> readHttpResponseHeaders(EmbraceConnection embraceConnection) {
        Map<String, List<String>> headerFields = embraceConnection.getHeaderFields();
        if (headerFields == null) {
            return t.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(headerFields.size()));
        Iterator<T> it2 = headerFields.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zq3.g(value, "it.value");
            linkedHashMap.put(key, i.u0((Iterable) value, null, null, null, 0, null, null, 63, null));
        }
        return linkedHashMap;
    }

    private final String readResponseBodyAsString(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 8192);
            try {
                String f = zj8.f(bufferedReader);
                gm0.a(bufferedReader, null);
                return f;
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read response body.", e);
        }
    }

    private final void setTimeouts(EmbraceConnection embraceConnection) {
        embraceConnection.setConnectTimeout(60000);
        embraceConnection.setReadTimeout(60000);
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiClient
    public ApiResponse executeGet(ApiRequest apiRequest) {
        EmbraceConnection embraceConnection;
        InputStream inputStream;
        InputStream inputStream2;
        zq3.h(apiRequest, "request");
        ww8 ww8Var = null;
        try {
            embraceConnection = apiRequest.toConnection();
            try {
                setTimeouts(embraceConnection);
                embraceConnection.connect();
                ApiResponse executeHttpRequest = executeHttpRequest(embraceConnection);
                try {
                    Result.a aVar = Result.a;
                    InputStream inputStream3 = embraceConnection.getInputStream();
                    if (inputStream3 != null) {
                        inputStream3.close();
                        ww8Var = ww8.a;
                    }
                    Result.b(ww8Var);
                    return executeHttpRequest;
                } catch (Throwable th) {
                    Result.a aVar2 = Result.a;
                    Result.b(f.a(th));
                    return executeHttpRequest;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    String localizedMessage = th.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "";
                    }
                    ApiResponse.Incomplete incomplete = new ApiResponse.Incomplete(new IllegalStateException(localizedMessage, th));
                    try {
                        Result.a aVar3 = Result.a;
                        if (embraceConnection != null && (inputStream2 = embraceConnection.getInputStream()) != null) {
                            inputStream2.close();
                            ww8Var = ww8.a;
                        }
                        Result.b(ww8Var);
                    } catch (Throwable th3) {
                        Result.a aVar4 = Result.a;
                        Result.b(f.a(th3));
                    }
                    return incomplete;
                } catch (Throwable th4) {
                    try {
                        Result.a aVar5 = Result.a;
                        if (embraceConnection != null && (inputStream = embraceConnection.getInputStream()) != null) {
                            inputStream.close();
                            ww8Var = ww8.a;
                        }
                        Result.b(ww8Var);
                    } catch (Throwable th5) {
                        Result.a aVar6 = Result.a;
                        Result.b(f.a(th5));
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            embraceConnection = null;
        }
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiClient
    public ApiResponse executePost(ApiRequest apiRequest, ss2 ss2Var) {
        EmbraceConnection embraceConnection;
        InputStream inputStream;
        InputStream inputStream2;
        zq3.h(apiRequest, "request");
        zq3.h(ss2Var, "action");
        ww8 ww8Var = null;
        try {
            embraceConnection = apiRequest.toConnection();
        } catch (Throwable th) {
            th = th;
            embraceConnection = null;
        }
        try {
            setTimeouts(embraceConnection);
            OutputStream outputStream = embraceConnection.getOutputStream();
            if (outputStream != null) {
                try {
                    Object invoke = ss2Var.invoke(outputStream);
                    gm0.a(outputStream, null);
                } finally {
                }
            }
            embraceConnection.connect();
            ApiResponse executeHttpRequest = executeHttpRequest(embraceConnection);
            try {
                Result.a aVar = Result.a;
                InputStream inputStream3 = embraceConnection.getInputStream();
                if (inputStream3 != null) {
                    inputStream3.close();
                    ww8Var = ww8.a;
                }
                Result.b(ww8Var);
                return executeHttpRequest;
            } catch (Throwable th2) {
                Result.a aVar2 = Result.a;
                Result.b(f.a(th2));
                return executeHttpRequest;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                ApiResponse.Incomplete incomplete = new ApiResponse.Incomplete(new IllegalStateException(localizedMessage, th));
                try {
                    Result.a aVar3 = Result.a;
                    if (embraceConnection != null && (inputStream2 = embraceConnection.getInputStream()) != null) {
                        inputStream2.close();
                        ww8Var = ww8.a;
                    }
                    Result.b(ww8Var);
                } catch (Throwable th4) {
                    Result.a aVar4 = Result.a;
                    Result.b(f.a(th4));
                }
                return incomplete;
            } catch (Throwable th5) {
                try {
                    Result.a aVar5 = Result.a;
                    if (embraceConnection != null && (inputStream = embraceConnection.getInputStream()) != null) {
                        inputStream.close();
                        ww8Var = ww8.a;
                    }
                    Result.b(ww8Var);
                } catch (Throwable th6) {
                    Result.a aVar6 = Result.a;
                    Result.b(f.a(th6));
                }
                throw th5;
            }
        }
    }
}
