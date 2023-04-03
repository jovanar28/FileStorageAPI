package baluni.implementation;

import baluni.filestorage.MyFileStorage;

public class GoogleDriveImpl extends MyFileStorage {
    @Override
    public boolean createStorage(String storagePath) {
        return false;
    }

    @Override
    public boolean createDirectory(String destination, String creationPattern) {
        return false;
    }

    @Override
    public boolean createFile(String fileName) {
        return false;
    }
}
