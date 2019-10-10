// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `userfile.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.qingzhenyun.common.ice.userfile;

public class SimpleFile extends com.zeroc.Ice.Value {
    public static final long serialVersionUID = 4537723145648043118L;
    public String uuid;
    public String path;

    public SimpleFile() {
        this.uuid = "";
        this.path = "";
    }

    public SimpleFile(String uuid, String path) {
        this.uuid = uuid;
        this.path = path;
    }

    public static String ice_staticId() {
        return "::userfile::SimpleFile";
    }

    public SimpleFile clone() {
        return (SimpleFile) super.clone();
    }

    @Override
    public String ice_id() {
        return ice_staticId();
    }

    @Override
    protected void _iceWriteImpl(com.zeroc.Ice.OutputStream ostr_) {
        ostr_.startSlice(ice_staticId(), -1, true);
        ostr_.writeString(uuid);
        ostr_.writeString(path);
        ostr_.endSlice();
    }

    @Override
    protected void _iceReadImpl(com.zeroc.Ice.InputStream istr_) {
        istr_.startSlice();
        uuid = istr_.readString();
        path = istr_.readString();
        istr_.endSlice();
    }
}
