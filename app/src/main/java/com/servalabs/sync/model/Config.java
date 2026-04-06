package com.servalabs.sync.model;

import java.util.List;

public class Config {
    public int version;
    public List<Device> devices;
    public List<Folder> folders;
    public Gui gui;
    public Options options;
    public Defaults defaults;
    public List<RemoteIgnoredDevice> remoteIgnoredDevices;
}
