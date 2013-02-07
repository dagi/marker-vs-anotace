/*
 * Copyright (C) 2007-2012, GoodData(R) Corporation. All rights reserved.
 */

public interface IPersistable<K> {

    K get();
    void set(K val);
}
