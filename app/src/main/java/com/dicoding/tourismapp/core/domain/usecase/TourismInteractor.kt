package com.dicoding.tourismapp.core.domain.usecase

import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.core.domain.model.Tourism
import com.dicoding.tourismapp.core.domain.repository.ITourismRepository
import io.reactivex.Flowable
import javax.inject.Inject

class TourismInteractor @Inject constructor(private val tourismRepository: ITourismRepository): TourismUseCase {
    override fun getAllTourism(): Flowable<Resource<List<Tourism>>> = tourismRepository.getAllTourism()

    override fun getFavoriteTourism(): Flowable<List<Tourism>> = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)
}