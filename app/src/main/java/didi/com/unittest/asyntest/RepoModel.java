package didi.com.unittest.asyntest;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xl on 2017/10/22.
 */

public class RepoModel {
        private Handler mUiHandler ;//= new Handler(Looper.getMainLooper());

    public RepoModel(Handler handler) {
        super();
        this.mUiHandler = handler;
    }
    public void loadRepos(final RepoCallback callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    final List<Repo> repos = new ArrayList<>();
                    repos.add(new Repo("android-unit-testing-tutorial",
                            "A repo that demos how to do android unit testing"));
                    mUiHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            callback.onSuccess(repos);
                        }
                    });
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                    mUiHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            callback.onFailure(500, e.getMessage());
                        }
                    });
                }
            }
        }).start();
    }

    interface RepoCallback {
        void onSuccess(List<Repo> repos);

        void onFailure(int code, String msg);
    }
}
