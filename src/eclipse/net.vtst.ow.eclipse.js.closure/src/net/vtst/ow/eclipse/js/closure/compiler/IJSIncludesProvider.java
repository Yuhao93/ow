package net.vtst.ow.eclipse.js.closure.compiler;

import java.io.File;

import net.vtst.ow.closure.compiler.deps.JSLibrary;

import com.google.javascript.jscomp.AbstractCompiler;

/**
 * Interface for providing JavaScript includes, which may be libraries or externs.
 * @author Vincent Simonet
 */
public interface IJSIncludesProvider {

  /**
   * Get a library from the provider.
   * @param compiler  The compiler used to report potential errors.
   * @param libraryPath  The base path of the library.
   * @param pathOfClosureBase  The Closure base path for this library.
   * @param isClosureBase  Whether this library is the closure base library.
   * @return  The library.
   */
  public JSLibrary getLibrary(AbstractCompiler compiler, File libraryPath, File pathOfClosureBase);

  /**
   * Clear any cached data of the provider.
   */
  public void clear();
}