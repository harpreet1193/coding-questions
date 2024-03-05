package com.example.codingquestions;
/*


Key Value Store
- Get
- Delete
- Put


 */

import java.util.HashMap;
import java.util.HashSet;

/*

Key and value will be strings.
small keys and values less than 10 bytes.

Key cannot be null

Get Operation:
Key Doesn't exist. -> Null value.
 */

/*Put
Key, Value none of it will be null.
if key exists, override.
 */

/*
Delete
 */


public class ZetaDsAlgo {

    private HashMap<String, String> committedKeyValue;
    private HashMap<String, String> unCommittedKeyValue;
    private HashSet<String> unCommittedDeletedKeys;

    private boolean isTransaction;

    public ZetaDsAlgo(){
        this.committedKeyValue = new HashMap<>();
        this.unCommittedKeyValue = new HashMap<>();
        this.unCommittedDeletedKeys = new HashSet<>();
        this.isTransaction = false;
    }

    public void beginTxn() {
        unCommittedKeyValue.clear();
        unCommittedDeletedKeys.clear();
        isTransaction = true;
    }

    public void commitTxn(){
        for(String key: unCommittedKeyValue.keySet()){
            committedKeyValue.put(key, unCommittedKeyValue.get(key));
        }
        for (String key : unCommittedDeletedKeys){
            committedKeyValue.remove(key);
        }
        unCommittedKeyValue.clear();
        unCommittedDeletedKeys.clear();
        isTransaction = false;
    }

    public void rollbackTxn() {
        unCommittedKeyValue.clear();
        unCommittedDeletedKeys.clear();
        isTransaction = false;
    }

    public String get(String key){
        if (isTransaction){
            if (unCommittedKeyValue.containsKey(key)){
                return unCommittedKeyValue.get(key);
            } else {
                if (!unCommittedDeletedKeys.contains(key)) {
                    if (committedKeyValue.containsKey(key)) {
                        return committedKeyValue.get(key);
                    }
                }
                return null;
            }
        } else {
            if (committedKeyValue.containsKey(key)) {
                return committedKeyValue.get(key);
            }
            return null;
        }
    }

    public void put (String key, String value){

        if (isTransaction){
            unCommittedKeyValue.put(key, value);
            unCommittedDeletedKeys.remove(key);
        } else {
            committedKeyValue.put(key, value);
        }
    }

    public boolean delete(String key) {
        try {
            if (isTransaction) {
                unCommittedDeletedKeys.add(key);
                if (unCommittedKeyValue.containsKey(key)) {
                    unCommittedKeyValue.remove(key);
                    return true;
                }
            } else {
                if (committedKeyValue.containsKey(key)) {
                    committedKeyValue.remove(key);
                    return true;
                }
            }
            return false;
        } catch (Exception exp){
            return false;
        }
    }

}
