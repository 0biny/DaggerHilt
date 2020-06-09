package domain

import com.javiersc.resources.resource.Resource
import domain.models.Champion
import domain.models.Error
import kotlinx.coroutines.flow.Flow

interface DataDragonRepo {
    fun getChampions(): Flow<Resource<List<Champion>, Error>>
}