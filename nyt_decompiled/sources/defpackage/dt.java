package defpackage;

/* loaded from: classes.dex */
public abstract class dt {
    private static final wt4 a = new a();
    private static final wt4 b = new b();

    public static final class a extends wt4 {
        a() {
            super(3, 4);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE sources RENAME TO temp_sources");
            sc8Var.B("ALTER TABLE assets RENAME TO temp_assets");
            sc8Var.B("\n            CREATE TABLE IF NOT EXISTS `assets` (\n                `uri` TEXT NOT NULL, `assetType` TEXT, `lastModified` TEXT NOT NULL, `url` TEXT, \n                `downloadDate` TEXT NOT NULL, `jsonData` TEXT NOT NULL, \n                PRIMARY KEY(`uri`))\n            ");
            sc8Var.B("\n            CREATE TABLE IF NOT EXISTS `requests` (\n                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestedUri` TEXT, `requestedUrl` TEXT, \n                `requestedLastModified` TEXT, `insertDate` TEXT NOT NULL, `attempts` INTEGER NOT NULL, \n                `nextAttempt` TEXT NOT NULL, `isRunning` INTEGER NOT NULL, `downloadedUri` TEXT, \n                FOREIGN KEY(`downloadedUri`) REFERENCES `assets`(`uri`) ON UPDATE NO ACTION ON DELETE CASCADE )\n            ");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_requests_requestedUri` ON `requests` (`requestedUri`)");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_requests_requestedUrl` ON `requests` (`requestedUrl`)");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_requests_downloadedUri` ON `requests` (`downloadedUri`)");
            sc8Var.B("\n            CREATE TABLE IF NOT EXISTS `sources` (\n                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestId` INTEGER NOT NULL, \n                `type` TEXT NOT NULL, `insertDate` TEXT NOT NULL, `expirationDate` TEXT, `externalId` INTEGER, \n                `additionalData` TEXT, `userEmail` TEXT, \n                FOREIGN KEY(`requestId`) REFERENCES `requests`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )\n            ");
            sc8Var.B("CREATE INDEX IF NOT EXISTS `index_sources_requestId` ON `sources` (`requestId`)");
            sc8Var.B("\n            insert into assets(uri, assetType, lastModified, url, downloadDate, jsonData) \n            select uri, assetType, jsonDataLastModified, url, downloadDate, jsonData \n            from temp_assets \n            where jsonData is not null\n            ");
            sc8Var.B("\n            insert into requests(requestedUri, requestedLastModified, insertDate, attempts, nextAttempt, isRunning, \n                downloadedUri) \n            select uri, requestedLastModified, insertDate, attempts, nextAttempt, isRunning, \n            case jsonData when null then null else uri end \n            from temp_assets\n            ");
            sc8Var.B("\n            insert into sources(requestId, type, insertDate, expirationDate, externalId, additionalData, userEmail) \n            select r.id, s.type, s.insertDate, s.expirationDate, s.externalId, s.additionalData, s.userEmail \n            from temp_sources s inner join requests r on s.uri = r.requestedUri\n            ");
            sc8Var.B("DROP TABLE temp_assets");
            sc8Var.B("DROP TABLE temp_sources");
        }
    }

    public static final class b extends wt4 {
        b() {
            super(4, 5);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("CREATE VIEW `OpenRequest` AS select requestedUri, requestedUrl, nextAttempt\n            from requests r\n        left outer join assets a on r.downloadedUri = a.uri\n        where \n            (r.downloadedUri is null or requestedLastModified > a.lastModified) and\n            isRunning = 0");
        }
    }

    public static final wt4 a() {
        return a;
    }

    public static final wt4 b() {
        return b;
    }
}
