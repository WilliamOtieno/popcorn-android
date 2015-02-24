/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class stat_channel {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected stat_channel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(stat_channel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_stat_channel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public stat_channel() {
    this(libtorrent_jni.new_stat_channel(), true);
  }

  public void add(int count) {
    libtorrent_jni.stat_channel_add(swigCPtr, this, count);
  }

  public void second_tick(int tick_interval_ms) {
    libtorrent_jni.stat_channel_second_tick(swigCPtr, this, tick_interval_ms);
  }

  public int rate() {
    return libtorrent_jni.stat_channel_rate(swigCPtr, this);
  }

  public int low_pass_rate() {
    return libtorrent_jni.stat_channel_low_pass_rate(swigCPtr, this);
  }

  public long total() {
    return libtorrent_jni.stat_channel_total(swigCPtr, this);
  }

  public void offset(long c) {
    libtorrent_jni.stat_channel_offset(swigCPtr, this, c);
  }

  public int counter() {
    return libtorrent_jni.stat_channel_counter(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.stat_channel_clear(swigCPtr, this);
  }

}
