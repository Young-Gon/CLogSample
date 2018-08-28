package com.gondev.clog;

import android.text.TextUtils;
import android.util.Log;


public class CLog
{

	public CLog()
	{
	}

	public static int v(String _msg)
	{
		return v(_msg, 1);
	}

	public static int v(String _msg, int deepth)
	{
		deepth+=4;
		if (TextUtils.isEmpty(_msg))
			return Log.e(makeTag(deepth), "CLog message parameter is empty!!");

		return Log.v(makeTag(deepth), _msg);
	}

	public static int d(String _msg)
	{
		return d(_msg, 1);
	}

	public static int d(String _msg, int deepth)
	{
		deepth+=4;
		if (TextUtils.isEmpty(_msg))
			return Log.e(makeTag(deepth), "CLog message parameter is empty!!");

		return Log.d(makeTag(deepth), _msg);
	}

	public static int i(String _msg)
	{
		return i(_msg, 1);
	}

	public static int i(String _msg, int deepth)
	{
		deepth+=4;
		if (TextUtils.isEmpty(_msg))
			return Log.e(makeTag(deepth), "CLog message parameter is empty!!");

		return Log.i(makeTag(deepth), _msg);
	}

	public static int w(String _msg)
	{
		return w(_msg, 1);
	}

	public static int w(String _msg, int deepth)
	{
		deepth+=4;
		if (TextUtils.isEmpty(_msg))
			return Log.e(makeTag(deepth), "CLog message parameter is empty!!");

		return Log.w(makeTag(deepth), _msg);
	}

	public static int e(String _msg)
	{
		return e(_msg, 1);
	}

	public static int e(String _msg, int deepth)
	{
		deepth+=4;
		if (TextUtils.isEmpty(_msg))
			return Log.e(makeTag(deepth), "CLog message parameter is empty!!");

		return Log.e(makeTag(deepth), _msg);
	}

	public static int e(String _msg, Throwable th)
	{
		return e(_msg, th, 1);
	}

	public static int e(String _msg, Throwable th, int deepth)
	{
		deepth+=4;
		if (TextUtils.isEmpty(_msg))
			return Log.e(makeTag(deepth), "CLog message parameter is empty!!");

		return Log.e(makeTag(deepth), _msg, th);
	}

	private static String makeTag(int depth)
	{
		StackTraceElement element = Thread.currentThread().getStackTrace()[depth];

		String str = element.getFileName();

		return element.getMethodName() + " (" + str + ":" + element.getLineNumber() + ")";
	}
}
