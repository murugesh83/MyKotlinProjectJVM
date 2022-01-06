package com.retrofitsample

data class MovieDetails(var title: String, var image: String){
    override fun toString(): String {
        return "MovieDetails(title='$title', image='$image')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MovieDetails

        if (title != other.title) return false
        if (image != other.image) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + image.hashCode()
        return result
    }

}
