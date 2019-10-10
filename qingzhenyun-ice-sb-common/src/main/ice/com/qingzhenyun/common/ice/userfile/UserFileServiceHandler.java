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

public interface UserFileServiceHandler extends com.zeroc.Ice.Object
{
    FileOperation[] fetchFileOperation(int size, com.zeroc.Ice.Current current);

    UserFileResponse createDirectory(long userId, String parent, String path, String name, com.zeroc.Ice.Current current);

    UserFileResponse createFile(long userId, String parent, String path, String name, long size, String storeId, com.zeroc.Ice.Current current);

    UserFilePageResponse listDirectoryPage(long userId, String uuid, int type, int page, int pageSize, int orderBy, com.zeroc.Ice.Current current);

    UserFileResponse[] listDirectory(long userId, String uuid, int type, int start, int size, int orderBy, com.zeroc.Ice.Current current);

    UserFileResponse get(long userId, String uuid, String path, com.zeroc.Ice.Current current);

    SimpleFileWithStoreId[] getSimpleFileWithStoreIdList(long userId, String[] pathList, com.zeroc.Ice.Current current);

    int rename(long userId, String uuid, String path, String newName, com.zeroc.Ice.Current current);

    int move(long userId, String uuid, String path, String destUuid, String destPath, com.zeroc.Ice.Current current);

    int copy(long userId, String uuid, String path, String destUuid, String destPath, com.zeroc.Ice.Current current);

    int remove(long userId, String uuid, String path, com.zeroc.Ice.Current current);

    int unlock(long userId, String uuid, com.zeroc.Ice.Current current);

    int deleteFile(long userId, String uuid, com.zeroc.Ice.Current current);

    int updateDirectorySize(long userId, String uuid, long fileSize, com.zeroc.Ice.Current current);

    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::userfile::UserFileServiceHandler"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::userfile::UserFileServiceHandler";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_fetchFileOperation(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_size;
        iceP_size = istr.readInt();
        inS.endReadParams();
        FileOperation[] ret = obj.fetchFileOperation(iceP_size, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        FileOperationListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_createDirectory(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_parent;
        String iceP_path;
        String iceP_name;
        iceP_userId = istr.readLong();
        iceP_parent = istr.readString();
        iceP_path = istr.readString();
        iceP_name = istr.readString();
        inS.endReadParams();
        UserFileResponse ret = obj.createDirectory(iceP_userId, iceP_parent, iceP_path, iceP_name, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeValue(ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_createFile(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_parent;
        String iceP_path;
        String iceP_name;
        long iceP_size;
        String iceP_storeId;
        iceP_userId = istr.readLong();
        iceP_parent = istr.readString();
        iceP_path = istr.readString();
        iceP_name = istr.readString();
        iceP_size = istr.readLong();
        iceP_storeId = istr.readString();
        inS.endReadParams();
        UserFileResponse ret = obj.createFile(iceP_userId, iceP_parent, iceP_path, iceP_name, iceP_size, iceP_storeId, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeValue(ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listDirectoryPage(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        int iceP_type;
        int iceP_page;
        int iceP_pageSize;
        int iceP_orderBy;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_type = istr.readInt();
        iceP_page = istr.readInt();
        iceP_pageSize = istr.readInt();
        iceP_orderBy = istr.readInt();
        inS.endReadParams();
        UserFilePageResponse ret = obj.listDirectoryPage(iceP_userId, iceP_uuid, iceP_type, iceP_page, iceP_pageSize, iceP_orderBy, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeValue(ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listDirectory(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        int iceP_type;
        int iceP_start;
        int iceP_size;
        int iceP_orderBy;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_type = istr.readInt();
        iceP_start = istr.readInt();
        iceP_size = istr.readInt();
        iceP_orderBy = istr.readInt();
        inS.endReadParams();
        UserFileResponse[] ret = obj.listDirectory(iceP_userId, iceP_uuid, iceP_type, iceP_start, iceP_size, iceP_orderBy, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        UserFileResponseListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_get(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        String iceP_path;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_path = istr.readString();
        inS.endReadParams();
        UserFileResponse ret = obj.get(iceP_userId, iceP_uuid, iceP_path, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeValue(ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getSimpleFileWithStoreIdList(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String[] iceP_pathList;
        iceP_userId = istr.readLong();
        iceP_pathList = istr.readStringSeq();
        inS.endReadParams();
        SimpleFileWithStoreId[] ret = obj.getSimpleFileWithStoreIdList(iceP_userId, iceP_pathList, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        SimpleFileWithStoreIdListHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_rename(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        String iceP_path;
        String iceP_newName;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_path = istr.readString();
        iceP_newName = istr.readString();
        inS.endReadParams();
        int ret = obj.rename(iceP_userId, iceP_uuid, iceP_path, iceP_newName, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_move(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        String iceP_path;
        String iceP_destUuid;
        String iceP_destPath;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_path = istr.readString();
        iceP_destUuid = istr.readString();
        iceP_destPath = istr.readString();
        inS.endReadParams();
        int ret = obj.move(iceP_userId, iceP_uuid, iceP_path, iceP_destUuid, iceP_destPath, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_copy(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        String iceP_path;
        String iceP_destUuid;
        String iceP_destPath;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_path = istr.readString();
        iceP_destUuid = istr.readString();
        iceP_destPath = istr.readString();
        inS.endReadParams();
        int ret = obj.copy(iceP_userId, iceP_uuid, iceP_path, iceP_destUuid, iceP_destPath, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_remove(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        String iceP_path;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_path = istr.readString();
        inS.endReadParams();
        int ret = obj.remove(iceP_userId, iceP_uuid, iceP_path, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_unlock(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        inS.endReadParams();
        int ret = obj.unlock(iceP_userId, iceP_uuid, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_deleteFile(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        inS.endReadParams();
        int ret = obj.deleteFile(iceP_userId, iceP_uuid, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_updateDirectorySize(UserFileServiceHandler obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        long iceP_userId;
        String iceP_uuid;
        long iceP_fileSize;
        iceP_userId = istr.readLong();
        iceP_uuid = istr.readString();
        iceP_fileSize = istr.readLong();
        inS.endReadParams();
        int ret = obj.updateDirectorySize(iceP_userId, iceP_uuid, iceP_fileSize, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    final static String[] _iceOps =
    {
        "copy",
        "createDirectory",
        "createFile",
        "deleteFile",
        "fetchFileOperation",
        "get",
        "getSimpleFileWithStoreIdList",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "listDirectory",
        "listDirectoryPage",
        "move",
        "remove",
        "rename",
        "unlock",
        "updateDirectorySize"
    };

    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_copy(this, in, current);
            }
            case 1:
            {
                return _iceD_createDirectory(this, in, current);
            }
            case 2:
            {
                return _iceD_createFile(this, in, current);
            }
            case 3:
            {
                return _iceD_deleteFile(this, in, current);
            }
            case 4:
            {
                return _iceD_fetchFileOperation(this, in, current);
            }
            case 5:
            {
                return _iceD_get(this, in, current);
            }
            case 6:
            {
                return _iceD_getSimpleFileWithStoreIdList(this, in, current);
            }
            case 7:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 8:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 9:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 10:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 11:
            {
                return _iceD_listDirectory(this, in, current);
            }
            case 12:
            {
                return _iceD_listDirectoryPage(this, in, current);
            }
            case 13:
            {
                return _iceD_move(this, in, current);
            }
            case 14:
            {
                return _iceD_remove(this, in, current);
            }
            case 15:
            {
                return _iceD_rename(this, in, current);
            }
            case 16:
            {
                return _iceD_unlock(this, in, current);
            }
            case 17:
            {
                return _iceD_updateDirectorySize(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
