package com.github.batou9150.jsondiff.services

import com.intellij.openapi.project.Project
import com.github.batou9150.jsondiff.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
