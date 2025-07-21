package org.jsoup.parser;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.parser.Token;

/* loaded from: classes5.dex */
enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char s = aVar.s();
            if (s == 0) {
                gVar.s(this);
                gVar.j(aVar.e());
            } else {
                if (s == '&') {
                    gVar.a(TokeniserState.CharacterReferenceInData);
                    return;
                }
                if (s == '<') {
                    gVar.a(TokeniserState.TagOpen);
                } else if (s != 65535) {
                    gVar.k(aVar.f());
                } else {
                    gVar.l(new Token.f());
                }
            }
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.readCharRef(gVar, TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char s = aVar.s();
            if (s == 0) {
                gVar.s(this);
                aVar.a();
                gVar.j(TokeniserState.replacementChar);
            } else {
                if (s == '&') {
                    gVar.a(TokeniserState.CharacterReferenceInRcdata);
                    return;
                }
                if (s == '<') {
                    gVar.a(TokeniserState.RcdataLessthanSign);
                } else if (s != 65535) {
                    gVar.k(aVar.f());
                } else {
                    gVar.l(new Token.f());
                }
            }
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.readCharRef(gVar, TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.readRawData(gVar, aVar, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.readRawData(gVar, aVar, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char s = aVar.s();
            if (s == 0) {
                gVar.s(this);
                aVar.a();
                gVar.j(TokeniserState.replacementChar);
            } else if (s != 65535) {
                gVar.k(aVar.m(TokeniserState.nullChar));
            } else {
                gVar.l(new Token.f());
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char s = aVar.s();
            if (s == '!') {
                gVar.a(TokeniserState.MarkupDeclarationOpen);
                return;
            }
            if (s == '/') {
                gVar.a(TokeniserState.EndTagOpen);
                return;
            }
            if (s == '?') {
                gVar.e();
                gVar.a(TokeniserState.BogusComment);
            } else if (aVar.E()) {
                gVar.h(true);
                gVar.v(TokeniserState.TagName);
            } else {
                gVar.s(this);
                gVar.j('<');
                gVar.v(TokeniserState.Data);
            }
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.t()) {
                gVar.q(this);
                gVar.k("</");
                gVar.v(TokeniserState.Data);
            } else if (aVar.E()) {
                gVar.h(false);
                gVar.v(TokeniserState.TagName);
            } else if (aVar.y('>')) {
                gVar.s(this);
                gVar.a(TokeniserState.Data);
            } else {
                gVar.s(this);
                gVar.e();
                gVar.a(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            gVar.i.v(aVar.l());
            char e = aVar.e();
            if (e == 0) {
                gVar.i.v(TokeniserState.replacementStr);
                return;
            }
            if (e != ' ') {
                if (e == '/') {
                    gVar.v(TokeniserState.SelfClosingStartTag);
                    return;
                }
                if (e == '<') {
                    aVar.K();
                    gVar.s(this);
                } else if (e != '>') {
                    if (e == 65535) {
                        gVar.q(this);
                        gVar.v(TokeniserState.Data);
                        return;
                    } else if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        gVar.i.u(e);
                        return;
                    }
                }
                gVar.p();
                gVar.v(TokeniserState.Data);
                return;
            }
            gVar.v(TokeniserState.BeforeAttributeName);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.y('/')) {
                gVar.i();
                gVar.a(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (aVar.E() && gVar.b() != null) {
                if (!aVar.r("</" + gVar.b())) {
                    gVar.i = gVar.h(false).B(gVar.b());
                    gVar.p();
                    aVar.K();
                    gVar.v(TokeniserState.Data);
                    return;
                }
            }
            gVar.k("<");
            gVar.v(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.E()) {
                gVar.k("</");
                gVar.v(TokeniserState.Rcdata);
            } else {
                gVar.h(false);
                gVar.i.u(aVar.s());
                gVar.h.append(aVar.s());
                gVar.a(TokeniserState.RCDATAEndTagName);
            }
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        private void anythingElse(g gVar, a aVar) {
            gVar.k("</" + gVar.h.toString());
            aVar.K();
            gVar.v(TokeniserState.Rcdata);
        }

        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.E()) {
                String i = aVar.i();
                gVar.i.v(i);
                gVar.h.append(i);
                return;
            }
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                if (gVar.t()) {
                    gVar.v(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    anythingElse(gVar, aVar);
                    return;
                }
            }
            if (e == '/') {
                if (gVar.t()) {
                    gVar.v(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(gVar, aVar);
                    return;
                }
            }
            if (e != '>') {
                anythingElse(gVar, aVar);
            } else if (!gVar.t()) {
                anythingElse(gVar, aVar);
            } else {
                gVar.p();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.y('/')) {
                gVar.i();
                gVar.a(TokeniserState.RawtextEndTagOpen);
            } else {
                gVar.j('<');
                gVar.v(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.readEndTag(gVar, aVar, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.handleDataEndTag(gVar, aVar, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '!') {
                gVar.k("<!");
                gVar.v(TokeniserState.ScriptDataEscapeStart);
                return;
            }
            if (e == '/') {
                gVar.i();
                gVar.v(TokeniserState.ScriptDataEndTagOpen);
            } else if (e != 65535) {
                gVar.k("<");
                aVar.K();
                gVar.v(TokeniserState.ScriptData);
            } else {
                gVar.k("<");
                gVar.q(this);
                gVar.v(TokeniserState.Data);
            }
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.readEndTag(gVar, aVar, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.handleDataEndTag(gVar, aVar, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.y('-')) {
                gVar.v(TokeniserState.ScriptData);
            } else {
                gVar.j('-');
                gVar.a(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.y('-')) {
                gVar.v(TokeniserState.ScriptData);
            } else {
                gVar.j('-');
                gVar.a(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.t()) {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
                return;
            }
            char s = aVar.s();
            if (s == 0) {
                gVar.s(this);
                aVar.a();
                gVar.j(TokeniserState.replacementChar);
            } else if (s == '-') {
                gVar.j('-');
                gVar.a(TokeniserState.ScriptDataEscapedDash);
            } else if (s != '<') {
                gVar.k(aVar.o('-', '<', TokeniserState.nullChar));
            } else {
                gVar.a(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.t()) {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
                return;
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.j(TokeniserState.replacementChar);
                gVar.v(TokeniserState.ScriptDataEscaped);
            } else if (e == '-') {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataEscapedDashDash);
            } else if (e == '<') {
                gVar.v(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.t()) {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
                return;
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.j(TokeniserState.replacementChar);
                gVar.v(TokeniserState.ScriptDataEscaped);
            } else {
                if (e == '-') {
                    gVar.j(e);
                    return;
                }
                if (e == '<') {
                    gVar.v(TokeniserState.ScriptDataEscapedLessthanSign);
                } else if (e != '>') {
                    gVar.j(e);
                    gVar.v(TokeniserState.ScriptDataEscaped);
                } else {
                    gVar.j(e);
                    gVar.v(TokeniserState.ScriptData);
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.E()) {
                if (aVar.y('/')) {
                    gVar.i();
                    gVar.a(TokeniserState.ScriptDataEscapedEndTagOpen);
                    return;
                } else {
                    gVar.j('<');
                    gVar.v(TokeniserState.ScriptDataEscaped);
                    return;
                }
            }
            gVar.i();
            gVar.h.append(aVar.s());
            gVar.k("<" + aVar.s());
            gVar.a(TokeniserState.ScriptDataDoubleEscapeStart);
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.E()) {
                gVar.k("</");
                gVar.v(TokeniserState.ScriptDataEscaped);
            } else {
                gVar.h(false);
                gVar.i.u(aVar.s());
                gVar.h.append(aVar.s());
                gVar.a(TokeniserState.ScriptDataEscapedEndTagName);
            }
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.handleDataEndTag(gVar, aVar, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.handleDataDoubleEscapeTag(gVar, aVar, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char s = aVar.s();
            if (s == 0) {
                gVar.s(this);
                aVar.a();
                gVar.j(TokeniserState.replacementChar);
            } else if (s == '-') {
                gVar.j(s);
                gVar.a(TokeniserState.ScriptDataDoubleEscapedDash);
            } else if (s == '<') {
                gVar.j(s);
                gVar.a(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (s != 65535) {
                gVar.k(aVar.o('-', '<', TokeniserState.nullChar));
            } else {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.j(TokeniserState.replacementChar);
                gVar.v(TokeniserState.ScriptDataDoubleEscaped);
            } else if (e == '-') {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (e == '<') {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (e != 65535) {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.j(TokeniserState.replacementChar);
                gVar.v(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            if (e == '-') {
                gVar.j(e);
                return;
            }
            if (e == '<') {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (e == '>') {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptData);
            } else if (e != 65535) {
                gVar.j(e);
                gVar.v(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (!aVar.y('/')) {
                gVar.v(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            gVar.j('/');
            gVar.i();
            gVar.a(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            TokeniserState.handleDataDoubleEscapeTag(gVar, aVar, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                aVar.K();
                gVar.s(this);
                gVar.i.C();
                gVar.v(TokeniserState.AttributeName);
                return;
            }
            if (e != ' ') {
                if (e != '\"' && e != '\'') {
                    if (e == '/') {
                        gVar.v(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (e == 65535) {
                        gVar.q(this);
                        gVar.v(TokeniserState.Data);
                        return;
                    }
                    if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                        return;
                    }
                    switch (e) {
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            aVar.K();
                            gVar.s(this);
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            break;
                        case '>':
                            break;
                        default:
                            gVar.i.C();
                            aVar.K();
                            gVar.v(TokeniserState.AttributeName);
                            return;
                    }
                    gVar.p();
                    gVar.v(TokeniserState.Data);
                    return;
                }
                gVar.s(this);
                gVar.i.C();
                gVar.i.p(e);
                gVar.v(TokeniserState.AttributeName);
            }
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            gVar.i.q(aVar.p(TokeniserState.attributeNameCharsSorted));
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.i.p(TokeniserState.replacementChar);
                return;
            }
            if (e != ' ') {
                if (e != '\"' && e != '\'') {
                    if (e == '/') {
                        gVar.v(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (e == 65535) {
                        gVar.q(this);
                        gVar.v(TokeniserState.Data);
                        return;
                    }
                    if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        switch (e) {
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                break;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                gVar.v(TokeniserState.BeforeAttributeValue);
                                break;
                            case '>':
                                gVar.p();
                                gVar.v(TokeniserState.Data);
                                break;
                            default:
                                gVar.i.p(e);
                                break;
                        }
                        return;
                    }
                }
                gVar.s(this);
                gVar.i.p(e);
                return;
            }
            gVar.v(TokeniserState.AfterAttributeName);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.i.p(TokeniserState.replacementChar);
                gVar.v(TokeniserState.AttributeName);
                return;
            }
            if (e != ' ') {
                if (e != '\"' && e != '\'') {
                    if (e == '/') {
                        gVar.v(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (e == 65535) {
                        gVar.q(this);
                        gVar.v(TokeniserState.Data);
                        return;
                    }
                    if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                        return;
                    }
                    switch (e) {
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            gVar.v(TokeniserState.BeforeAttributeValue);
                            break;
                        case '>':
                            gVar.p();
                            gVar.v(TokeniserState.Data);
                            break;
                        default:
                            gVar.i.C();
                            aVar.K();
                            gVar.v(TokeniserState.AttributeName);
                            break;
                    }
                    return;
                }
                gVar.s(this);
                gVar.i.C();
                gVar.i.p(e);
                gVar.v(TokeniserState.AttributeName);
            }
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.i.r(TokeniserState.replacementChar);
                gVar.v(TokeniserState.AttributeValue_unquoted);
                return;
            }
            if (e != ' ') {
                if (e == '\"') {
                    gVar.v(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                if (e != '`') {
                    if (e == 65535) {
                        gVar.q(this);
                        gVar.p();
                        gVar.v(TokeniserState.Data);
                        return;
                    }
                    if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                        return;
                    }
                    if (e == '&') {
                        aVar.K();
                        gVar.v(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    if (e == '\'') {
                        gVar.v(TokeniserState.AttributeValue_singleQuoted);
                        return;
                    }
                    switch (e) {
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            break;
                        case '>':
                            gVar.s(this);
                            gVar.p();
                            gVar.v(TokeniserState.Data);
                            break;
                        default:
                            aVar.K();
                            gVar.v(TokeniserState.AttributeValue_unquoted);
                            break;
                    }
                    return;
                }
                gVar.s(this);
                gVar.i.r(e);
                gVar.v(TokeniserState.AttributeValue_unquoted);
            }
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            String p = aVar.p(TokeniserState.attributeDoubleValueCharsSorted);
            if (p.length() > 0) {
                gVar.i.s(p);
            } else {
                gVar.i.F();
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.i.r(TokeniserState.replacementChar);
                return;
            }
            if (e == '\"') {
                gVar.v(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (e != '&') {
                if (e != 65535) {
                    gVar.i.r(e);
                    return;
                } else {
                    gVar.q(this);
                    gVar.v(TokeniserState.Data);
                    return;
                }
            }
            int[] d = gVar.d('\"', true);
            if (d != null) {
                gVar.i.t(d);
            } else {
                gVar.i.r('&');
            }
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            String p = aVar.p(TokeniserState.attributeSingleValueCharsSorted);
            if (p.length() > 0) {
                gVar.i.s(p);
            } else {
                gVar.i.F();
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.i.r(TokeniserState.replacementChar);
                return;
            }
            if (e == 65535) {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != '&') {
                if (e != '\'') {
                    gVar.i.r(e);
                    return;
                } else {
                    gVar.v(TokeniserState.AfterAttributeValue_quoted);
                    return;
                }
            }
            int[] d = gVar.d('\'', true);
            if (d != null) {
                gVar.i.t(d);
            } else {
                gVar.i.r('&');
            }
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            String p = aVar.p(TokeniserState.attributeValueUnquoted);
            if (p.length() > 0) {
                gVar.i.s(p);
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.i.r(TokeniserState.replacementChar);
                return;
            }
            if (e != ' ') {
                if (e != '\"' && e != '`') {
                    if (e == 65535) {
                        gVar.q(this);
                        gVar.v(TokeniserState.Data);
                        return;
                    }
                    if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                        if (e == '&') {
                            int[] d = gVar.d('>', true);
                            if (d != null) {
                                gVar.i.t(d);
                                return;
                            } else {
                                gVar.i.r('&');
                                return;
                            }
                        }
                        if (e != '\'') {
                            switch (e) {
                                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                    break;
                                case '>':
                                    gVar.p();
                                    gVar.v(TokeniserState.Data);
                                    break;
                                default:
                                    gVar.i.r(e);
                                    break;
                            }
                            return;
                        }
                    }
                }
                gVar.s(this);
                gVar.i.r(e);
                return;
            }
            gVar.v(TokeniserState.BeforeAttributeName);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                gVar.v(TokeniserState.BeforeAttributeName);
                return;
            }
            if (e == '/') {
                gVar.v(TokeniserState.SelfClosingStartTag);
                return;
            }
            if (e == '>') {
                gVar.p();
                gVar.v(TokeniserState.Data);
            } else if (e == 65535) {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
            } else {
                aVar.K();
                gVar.s(this);
                gVar.v(TokeniserState.BeforeAttributeName);
            }
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '>') {
                gVar.i.i = true;
                gVar.p();
                gVar.v(TokeniserState.Data);
            } else if (e == 65535) {
                gVar.q(this);
                gVar.v(TokeniserState.Data);
            } else {
                aVar.K();
                gVar.s(this);
                gVar.v(TokeniserState.BeforeAttributeName);
            }
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            aVar.K();
            gVar.n.q(aVar.m('>'));
            char e = aVar.e();
            if (e == '>' || e == 65535) {
                gVar.n();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.w("--")) {
                gVar.f();
                gVar.v(TokeniserState.CommentStart);
            } else {
                if (aVar.x("DOCTYPE")) {
                    gVar.v(TokeniserState.Doctype);
                    return;
                }
                if (aVar.w("[CDATA[")) {
                    gVar.i();
                    gVar.v(TokeniserState.CdataSection);
                } else {
                    gVar.s(this);
                    gVar.e();
                    gVar.a(TokeniserState.BogusComment);
                }
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.n.p(TokeniserState.replacementChar);
                gVar.v(TokeniserState.Comment);
                return;
            }
            if (e == '-') {
                gVar.v(TokeniserState.CommentStartDash);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                aVar.K();
                gVar.v(TokeniserState.Comment);
            } else {
                gVar.q(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.n.p(TokeniserState.replacementChar);
                gVar.v(TokeniserState.Comment);
                return;
            }
            if (e == '-') {
                gVar.v(TokeniserState.CommentStartDash);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                gVar.n.p(e);
                gVar.v(TokeniserState.Comment);
            } else {
                gVar.q(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char s = aVar.s();
            if (s == 0) {
                gVar.s(this);
                aVar.a();
                gVar.n.p(TokeniserState.replacementChar);
            } else if (s == '-') {
                gVar.a(TokeniserState.CommentEndDash);
            } else {
                if (s != 65535) {
                    gVar.n.q(aVar.o('-', TokeniserState.nullChar));
                    return;
                }
                gVar.q(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.n.p('-').p(TokeniserState.replacementChar);
                gVar.v(TokeniserState.Comment);
            } else {
                if (e == '-') {
                    gVar.v(TokeniserState.CommentEnd);
                    return;
                }
                if (e != 65535) {
                    gVar.n.p('-').p(e);
                    gVar.v(TokeniserState.Comment);
                } else {
                    gVar.q(this);
                    gVar.n();
                    gVar.v(TokeniserState.Data);
                }
            }
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.n.q("--").p(TokeniserState.replacementChar);
                gVar.v(TokeniserState.Comment);
                return;
            }
            if (e == '!') {
                gVar.s(this);
                gVar.v(TokeniserState.CommentEndBang);
                return;
            }
            if (e == '-') {
                gVar.s(this);
                gVar.n.p('-');
                return;
            }
            if (e == '>') {
                gVar.n();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                gVar.s(this);
                gVar.n.q("--").p(e);
                gVar.v(TokeniserState.Comment);
            } else {
                gVar.q(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.n.q("--!").p(TokeniserState.replacementChar);
                gVar.v(TokeniserState.Comment);
                return;
            }
            if (e == '-') {
                gVar.n.q("--!");
                gVar.v(TokeniserState.CommentEndDash);
                return;
            }
            if (e == '>') {
                gVar.n();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                gVar.n.q("--!").p(e);
                gVar.v(TokeniserState.Comment);
            } else {
                gVar.q(this);
                gVar.n();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                gVar.v(TokeniserState.BeforeDoctypeName);
                return;
            }
            if (e != '>') {
                if (e != 65535) {
                    gVar.s(this);
                    gVar.v(TokeniserState.BeforeDoctypeName);
                    return;
                }
                gVar.q(this);
            }
            gVar.s(this);
            gVar.g();
            gVar.m.f = true;
            gVar.o();
            gVar.v(TokeniserState.Data);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.E()) {
                gVar.g();
                gVar.v(TokeniserState.DoctypeName);
                return;
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.g();
                gVar.m.b.append(TokeniserState.replacementChar);
                gVar.v(TokeniserState.DoctypeName);
                return;
            }
            if (e != ' ') {
                if (e == 65535) {
                    gVar.q(this);
                    gVar.g();
                    gVar.m.f = true;
                    gVar.o();
                    gVar.v(TokeniserState.Data);
                    return;
                }
                if (e == '\t' || e == '\n' || e == '\f' || e == '\r') {
                    return;
                }
                gVar.g();
                gVar.m.b.append(e);
                gVar.v(TokeniserState.DoctypeName);
            }
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.E()) {
                gVar.m.b.append(aVar.i());
                return;
            }
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.m.b.append(TokeniserState.replacementChar);
                return;
            }
            if (e != ' ') {
                if (e == '>') {
                    gVar.o();
                    gVar.v(TokeniserState.Data);
                    return;
                }
                if (e == 65535) {
                    gVar.q(this);
                    gVar.m.f = true;
                    gVar.o();
                    gVar.v(TokeniserState.Data);
                    return;
                }
                if (e != '\t' && e != '\n' && e != '\f' && e != '\r') {
                    gVar.m.b.append(e);
                    return;
                }
            }
            gVar.v(TokeniserState.AfterDoctypeName);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            if (aVar.t()) {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (aVar.A('\t', '\n', '\r', '\f', ' ')) {
                aVar.a();
                return;
            }
            if (aVar.y('>')) {
                gVar.o();
                gVar.a(TokeniserState.Data);
                return;
            }
            if (aVar.x("PUBLIC")) {
                gVar.m.c = "PUBLIC";
                gVar.v(TokeniserState.AfterDoctypePublicKeyword);
            } else if (aVar.x("SYSTEM")) {
                gVar.m.c = "SYSTEM";
                gVar.v(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                gVar.s(this);
                gVar.m.f = true;
                gVar.a(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                gVar.v(TokeniserState.BeforeDoctypePublicIdentifier);
                return;
            }
            if (e == '\"') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (e == '\'') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.s(this);
                gVar.m.f = true;
                gVar.v(TokeniserState.BogusDoctype);
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                return;
            }
            if (e == '\"') {
                gVar.v(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (e == '\'') {
                gVar.v(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.s(this);
                gVar.m.f = true;
                gVar.v(TokeniserState.BogusDoctype);
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.m.d.append(TokeniserState.replacementChar);
                return;
            }
            if (e == '\"') {
                gVar.v(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.m.d.append(e);
                return;
            }
            gVar.q(this);
            gVar.m.f = true;
            gVar.o();
            gVar.v(TokeniserState.Data);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.m.d.append(TokeniserState.replacementChar);
                return;
            }
            if (e == '\'') {
                gVar.v(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.m.d.append(e);
                return;
            }
            gVar.q(this);
            gVar.m.f = true;
            gVar.o();
            gVar.v(TokeniserState.Data);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                gVar.v(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
                return;
            }
            if (e == '\"') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (e == '\'') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (e == '>') {
                gVar.o();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                gVar.s(this);
                gVar.m.f = true;
                gVar.v(TokeniserState.BogusDoctype);
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                return;
            }
            if (e == '\"') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (e == '\'') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (e == '>') {
                gVar.o();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                gVar.s(this);
                gVar.m.f = true;
                gVar.v(TokeniserState.BogusDoctype);
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                gVar.v(TokeniserState.BeforeDoctypeSystemIdentifier);
                return;
            }
            if (e == '\"') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (e == '\'') {
                gVar.s(this);
                gVar.v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                return;
            }
            if (e == '\"') {
                gVar.v(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (e == '\'') {
                gVar.v(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.s(this);
                gVar.m.f = true;
                gVar.v(TokeniserState.BogusDoctype);
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.m.e.append(TokeniserState.replacementChar);
                return;
            }
            if (e == '\"') {
                gVar.v(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.m.e.append(e);
                return;
            }
            gVar.q(this);
            gVar.m.f = true;
            gVar.o();
            gVar.v(TokeniserState.Data);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == 0) {
                gVar.s(this);
                gVar.m.e.append(TokeniserState.replacementChar);
                return;
            }
            if (e == '\'') {
                gVar.v(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (e == '>') {
                gVar.s(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
                return;
            }
            if (e != 65535) {
                gVar.m.e.append(e);
                return;
            }
            gVar.q(this);
            gVar.m.f = true;
            gVar.o();
            gVar.v(TokeniserState.Data);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                return;
            }
            if (e == '>') {
                gVar.o();
                gVar.v(TokeniserState.Data);
            } else if (e != 65535) {
                gVar.s(this);
                gVar.v(TokeniserState.BogusDoctype);
            } else {
                gVar.q(this);
                gVar.m.f = true;
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            char e = aVar.e();
            if (e == '>') {
                gVar.o();
                gVar.v(TokeniserState.Data);
            } else {
                if (e != 65535) {
                    return;
                }
                gVar.o();
                gVar.v(TokeniserState.Data);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        void read(g gVar, a aVar) {
            gVar.h.append(aVar.n("]]>"));
            if (aVar.w("]]>") || aVar.t()) {
                gVar.l(new Token.b(gVar.h.toString()));
                gVar.v(TokeniserState.Data);
            }
        }
    };

    private static final char eof = 65535;
    static final char nullChar = 0;
    static final char[] attributeSingleValueCharsSorted = {nullChar, '&', '\''};
    static final char[] attributeDoubleValueCharsSorted = {nullChar, '\"', '&'};
    static final char[] attributeNameCharsSorted = {nullChar, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = {nullChar, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    private static final char replacementChar = 65533;
    private static final String replacementStr = String.valueOf(replacementChar);

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(g gVar, a aVar, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (aVar.E()) {
            String i = aVar.i();
            gVar.h.append(i);
            gVar.k(i);
            return;
        }
        char e = aVar.e();
        if (e != '\t' && e != '\n' && e != '\f' && e != '\r' && e != ' ' && e != '/' && e != '>') {
            aVar.K();
            gVar.v(tokeniserState2);
        } else {
            if (gVar.h.toString().equals("script")) {
                gVar.v(tokeniserState);
            } else {
                gVar.v(tokeniserState2);
            }
            gVar.j(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataEndTag(g gVar, a aVar, TokeniserState tokeniserState) {
        if (aVar.E()) {
            String i = aVar.i();
            gVar.i.v(i);
            gVar.h.append(i);
            return;
        }
        if (gVar.t() && !aVar.t()) {
            char e = aVar.e();
            if (e == '\t' || e == '\n' || e == '\f' || e == '\r' || e == ' ') {
                gVar.v(BeforeAttributeName);
                return;
            }
            if (e == '/') {
                gVar.v(SelfClosingStartTag);
                return;
            } else {
                if (e == '>') {
                    gVar.p();
                    gVar.v(Data);
                    return;
                }
                gVar.h.append(e);
            }
        }
        gVar.k("</" + gVar.h.toString());
        gVar.v(tokeniserState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readCharRef(g gVar, TokeniserState tokeniserState) {
        int[] d = gVar.d(null, false);
        if (d == null) {
            gVar.j('&');
        } else {
            gVar.m(d);
        }
        gVar.v(tokeniserState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readEndTag(g gVar, a aVar, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (aVar.E()) {
            gVar.h(false);
            gVar.v(tokeniserState);
        } else {
            gVar.k("</");
            gVar.v(tokeniserState2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readRawData(g gVar, a aVar, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char s = aVar.s();
        if (s == 0) {
            gVar.s(tokeniserState);
            aVar.a();
            gVar.j(replacementChar);
        } else if (s == '<') {
            gVar.a(tokeniserState2);
        } else if (s != 65535) {
            gVar.k(aVar.k());
        } else {
            gVar.l(new Token.f());
        }
    }

    abstract void read(g gVar, a aVar);
}
