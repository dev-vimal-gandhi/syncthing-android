package com.servalabs.sync;

import com.servalabs.sync.activities.DeviceActivity;
import com.servalabs.sync.activities.FirstStartActivity;
import com.servalabs.sync.activities.FolderActivity;
import com.servalabs.sync.activities.MainActivity;
import com.servalabs.sync.activities.PhotoShootActivity;
import com.servalabs.sync.activities.RecentChangesActivity;
import com.servalabs.sync.activities.ShareActivity;
import com.servalabs.sync.activities.SyncConditionsActivity;
import com.servalabs.sync.fragments.DeviceListFragment;
import com.servalabs.sync.fragments.FolderListFragment;
import com.servalabs.sync.fragments.StatusFragment;
import com.servalabs.sync.receiver.AppConfigReceiver;
import com.servalabs.sync.service.RunConditionMonitor;
import com.servalabs.sync.service.EventProcessor;
import com.servalabs.sync.service.RestApi;
import com.servalabs.sync.service.SyncthingRunnable;
import com.servalabs.sync.service.SyncthingService;
import com.servalabs.sync.settings.SettingsActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SyncthingModule.class})
public interface DaggerComponent {
    void inject(AppConfigReceiver appConfigReceiver);
    void inject(DeviceActivity activity);
    void inject(DeviceListFragment fragment);
    void inject(EventProcessor eventProcessor);
    void inject(FirstStartActivity activity);
    void inject(FolderActivity activity);
    void inject(FolderListFragment fragment);
    void inject(MainActivity activity);
    void inject(PhotoShootActivity photoShootActivity);
    void inject(RestApi restApi);
    void inject(RecentChangesActivity recentChangesActivity);
    void inject(RunConditionMonitor runConditionMonitor);
    void inject(SettingsActivity settingsActivity);
    void inject(ShareActivity activity);
    void inject(StatusFragment fragment);
    void inject(SyncConditionsActivity activity);
    void inject(SyncthingApp app);
    void inject(SyncthingRunnable syncthingRunnable);
    void inject(SyncthingService service);
}
