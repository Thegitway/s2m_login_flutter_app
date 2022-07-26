package com.s2m.gbmagent.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by S2M on 2020-04-04.
 */
@Entity(tableName = "SecretQuestion")
public class SecretQuestion implements Serializable {

    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    private Long id;

    @SerializedName("key")
    @ColumnInfo(name = "key")
    private String key;

    @SerializedName("value")
    @ColumnInfo(name = "value")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
