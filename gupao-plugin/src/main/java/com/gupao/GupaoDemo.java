package com.gupao;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "gukeshuai",defaultPhase = LifecyclePhase.PACKAGE)
public class GupaoDemo extends AbstractMojo{
    private String aaa = "";
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.print("gupao plugin !!!!!!!!!!！！");
    }
}
