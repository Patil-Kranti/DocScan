package com.kranti.doc.scanner.crop

import android.widget.ImageView
import com.kranti.doc.scanner.view.PaperRectangle


/**
 * Created by kranti on 15/09/2017.
 */
class ICropView {
    interface Proxy {
        fun getPaper(): ImageView
        fun getPaperRect(): PaperRectangle
        fun getCroppedPaper(): ImageView
    }
}