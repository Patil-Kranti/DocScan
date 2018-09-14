package com.kranti.doc.scanner.crop

import android.widget.ImageView
import com.kranti.doc.scanner.R
import com.kranti.doc.scanner.base.BaseActivity
import com.kranti.doc.scanner.view.PaperRectangle
import kotlinx.android.synthetic.main.activity_crop.*

class CropActivity : BaseActivity(), ICropView.Proxy {

    private lateinit var mPresenter: CropPresenter

    override fun prepare() {
        crop.setOnClickListener { mPresenter.crop() }
        enhance.setOnClickListener { mPresenter.enhance() }
        save.setOnClickListener { mPresenter.save() }
    }

    override fun provideContentViewId(): Int = R.layout.activity_crop


    override fun initPresenter() {
        mPresenter = CropPresenter(this, this)
    }

    override fun getPaper(): ImageView = paper

    override fun getPaperRect(): PaperRectangle = paper_rect

    override fun getCroppedPaper(): ImageView = picture_cropped
}