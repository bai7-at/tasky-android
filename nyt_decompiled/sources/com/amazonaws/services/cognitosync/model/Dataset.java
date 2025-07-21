package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.Date;

@Deprecated
/* loaded from: classes.dex */
public class Dataset implements Serializable {
    private Date creationDate;
    private Long dataStorage;
    private String datasetName;
    private String identityId;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private Long numRecords;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Dataset)) {
            return false;
        }
        Dataset dataset = (Dataset) obj;
        if ((dataset.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (dataset.getIdentityId() != null && !dataset.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((dataset.getDatasetName() == null) ^ (getDatasetName() == null)) {
            return false;
        }
        if (dataset.getDatasetName() != null && !dataset.getDatasetName().equals(getDatasetName())) {
            return false;
        }
        if ((dataset.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (dataset.getCreationDate() != null && !dataset.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((dataset.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        if (dataset.getLastModifiedDate() != null && !dataset.getLastModifiedDate().equals(getLastModifiedDate())) {
            return false;
        }
        if ((dataset.getLastModifiedBy() == null) ^ (getLastModifiedBy() == null)) {
            return false;
        }
        if (dataset.getLastModifiedBy() != null && !dataset.getLastModifiedBy().equals(getLastModifiedBy())) {
            return false;
        }
        if ((dataset.getDataStorage() == null) ^ (getDataStorage() == null)) {
            return false;
        }
        if (dataset.getDataStorage() != null && !dataset.getDataStorage().equals(getDataStorage())) {
            return false;
        }
        if ((dataset.getNumRecords() == null) ^ (getNumRecords() == null)) {
            return false;
        }
        return dataset.getNumRecords() == null || dataset.getNumRecords().equals(getNumRecords());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Long getDataStorage() {
        return this.dataStorage;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public Long getNumRecords() {
        return this.numRecords;
    }

    public int hashCode() {
        return (((((((((((((getIdentityId() == null ? 0 : getIdentityId().hashCode()) + 31) * 31) + (getDatasetName() == null ? 0 : getDatasetName().hashCode())) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getLastModifiedDate() == null ? 0 : getLastModifiedDate().hashCode())) * 31) + (getLastModifiedBy() == null ? 0 : getLastModifiedBy().hashCode())) * 31) + (getDataStorage() == null ? 0 : getDataStorage().hashCode())) * 31) + (getNumRecords() != null ? getNumRecords().hashCode() : 0);
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setDataStorage(Long l) {
        this.dataStorage = l;
    }

    public void setDatasetName(String str) {
        this.datasetName = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setLastModifiedBy(String str) {
        this.lastModifiedBy = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setNumRecords(Long l) {
        this.numRecords = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getDatasetName() != null) {
            sb.append("DatasetName: " + getDatasetName() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("CreationDate: " + getCreationDate() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        }
        if (getLastModifiedBy() != null) {
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        }
        if (getDataStorage() != null) {
            sb.append("DataStorage: " + getDataStorage() + ",");
        }
        if (getNumRecords() != null) {
            sb.append("NumRecords: " + getNumRecords());
        }
        sb.append("}");
        return sb.toString();
    }

    public Dataset withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public Dataset withDataStorage(Long l) {
        this.dataStorage = l;
        return this;
    }

    public Dataset withDatasetName(String str) {
        this.datasetName = str;
        return this;
    }

    public Dataset withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public Dataset withLastModifiedBy(String str) {
        this.lastModifiedBy = str;
        return this;
    }

    public Dataset withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public Dataset withNumRecords(Long l) {
        this.numRecords = l;
        return this;
    }
}
