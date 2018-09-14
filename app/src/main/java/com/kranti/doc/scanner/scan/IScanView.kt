package com.kranti.doc.scanner.scan

import android.view.Display
import android.view.SurfaceView
import com.kranti.doc.scanner.view.PaperRectangle

interface IScanView {
    interface Proxy {
        fun exit()
        fun getDisplay(): Display
        fun getSurfaceView(): SurfaceView
        fun getPaperRect(): PaperRectangle
    }
}