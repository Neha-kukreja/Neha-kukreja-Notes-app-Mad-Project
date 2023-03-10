package com.languagexx.simplenotes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/languagexx/simplenotes/di/FragmentBuildersModule;", "", "()V", "contributeAddFragment", "Lcom/languagexx/simplenotes/ui/AddFragment;", "contributeEditFragment", "Lcom/languagexx/simplenotes/ui/EditFragment;", "contributeListFragment", "Lcom/languagexx/simplenotes/ui/ListFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.languagexx.simplenotes.ui.ListFragment contributeListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.languagexx.simplenotes.ui.AddFragment contributeAddFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.languagexx.simplenotes.ui.EditFragment contributeEditFragment();
    
    public FragmentBuildersModule() {
        super();
    }
}