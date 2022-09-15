package com.example.mygroceryapp

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface GroceryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: GroceryItems)

    @Delete
    fun delete(item: GroceryItems)

    @Query("SELECT*FROM grocery_items")
    fun getALLGroceryItems(): LiveData<List<GroceryItems>>
}