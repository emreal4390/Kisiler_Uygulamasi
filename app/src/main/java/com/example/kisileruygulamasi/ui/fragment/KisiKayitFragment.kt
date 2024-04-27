package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {

private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=DataBindingUtil.inflate(inflater,R.layout.fragment_kisi_kayit,container,false)
        binding.kisiKayitFragment=this
        binding.kisiKayitToolbarBaslik="Kişi Kayıt"
        return binding.root
    }

    fun buttonKaydet(kisi_ad:String,kisi_tel:String){
    Log.e("Kişi Kaydet","$kisi_ad-$kisi_tel")
    }

}