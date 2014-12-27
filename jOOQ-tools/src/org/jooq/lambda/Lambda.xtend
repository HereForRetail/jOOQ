/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.lambda


/**
 * @author Lukas Eder
 */

import org.jooq.xtend.Generators

class Lambda extends Generators {
    
    def static void main(String[] args) {
        val lambda = new Lambda();
        lambda.generateTuple();
        lambda.generateTuples();
        lambda.generateFunctions();
    }
    
    def max() {
        8;
    }
    
    def copyright() {
        '''
        /**
         * Copyright (c) 2014-2015, Data Geekery GmbH, contact@datageekery.com
         *
         * Licensed under the Apache License, Version 2.0 (the "License");
         * you may not use this file except in compliance with the License.
         * You may obtain a copy of the License at
         *
         *     http://www.apache.org/licenses/LICENSE-2.0
         *
         * Unless required by applicable law or agreed to in writing, software
         * distributed under the License is distributed on an "AS IS" BASIS,
         * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
         * See the License for the specific language governing permissions and
         * limitations under the License.
         */
        '''
    }
    
    def generateTuple() {
        write("org.jooq.lambda.tuple.Tuple", 
            '''
            «copyright»
            package org.jooq.lambda.tuple;
            
            import java.util.List;
            
            /**
             * A tuple.
             *
             * @author Lukas Eder
             */
            public interface Tuple extends Iterable<Object> {
            «FOR degree : (1 .. max)»
            
                /**
                 * Construct a tuple of degree «degree».
                 */
                static <«TN(degree)»> Tuple«degree»<«TN(degree)»> tuple(«TN_XXXn(degree, "v")») {
                    return new Tuple«degree»<>(«vn(degree)»);
                }
            «ENDFOR»
            
                /**
                 * Create a new range.
                 */
                static <T extends Comparable<T>> Range<T> range(T t1, T t2) {
                    return new Range<>(t1, t2);
                }

                /**
                 * Get an array representation of this tuple.
                 */
                Object[] array();
            
                /**
                 * Get a list representation of this tuple.
                 */
                List<?> list();
            
                /**
                 * The degree of this tuple.
                 */
                int degree();
            }
            '''
        );
    }
    
    def generateTuples() {
        for (degree : 1 .. max) {
            write(
                "org.jooq.lambda.tuple.Tuple" + degree,
                '''
                «copyright»
                package org.jooq.lambda.tuple;
                
                import java.io.Serializable;
                import java.util.Arrays;
                import java.util.Iterator;
                import java.util.List;
                import java.util.Objects;
                «IF degree == 2»
                import java.util.Optional;
                «ENDIF»
                
                «IF degree != 1»
                import org.jooq.lambda.function.Function1;
                «ENDIF»
                import org.jooq.lambda.function.Function«degree»;
                
                /**
                 * A tuple of degree «degree».
                 *
                 * @author Lukas Eder
                 */
                public class Tuple«degree»<«TN(degree)»> implements Tuple, Comparable<Tuple«degree»<«TN(degree)»>>, Serializable, Cloneable {
                
                    private static final long serialVersionUID = 1L;
                    «FOR d : 1 .. degree»

                    public final T«d» v«d»;
                    «ENDFOR»
                    «FOR d : 1 .. degree»

                    public T«d» v«d»() {
                        return v«d»;
                    }
                    «ENDFOR»
                
                    public Tuple«degree»(Tuple«degree»<«TN(degree)»> tuple) {
                        «FOR d : 1 .. degree»
                        this.v«d» = tuple.v«d»;
                        «ENDFOR»
                    }
                
                    public Tuple«degree»(«TN_XXXn(degree, "v")») {
                        «FOR d : 1 .. degree»
                        this.v«d» = v«d»;
                        «ENDFOR»
                    }
                    «IF degree == 2»

                    /**
                     * Get a tuple with the two attributes swapped.
                     */
                    public final Tuple2<T2, T1> swap() {
                        return new Tuple2<>(v2, v1);
                    }

                    /**
                     * Whether two tuples overlap.
                     * <p>
                     * <code><pre>
                     * // true
                     * range(1, 3).overlaps(range(2, 4))
                     *
                     * // false
                     * range(1, 3).overlaps(range(5, 8))
                     * </pre></code>
                     */
                    public static final <T extends Comparable<T>> boolean overlaps(Tuple2<T, T> left, Tuple2<T, T> right) {
                        return left.v1.compareTo(right.v2) <= 0
                            && left.v2.compareTo(right.v1) >= 0;
                    }

                    /**
                     * The intersection of two ranges.
                     * <p>
                     * <code><pre>
                     * // (2, 3)
                     * range(1, 3).intersect(range(2, 4))
                     *
                     * // none
                     * range(1, 3).intersect(range(5, 8))
                     * </pre></code>
                     */
                    public static final <T extends Comparable<T>> Optional<Tuple2<T, T>> intersect(Tuple2<T, T> left, Tuple2<T, T> right) {
                        if (overlaps(left, right))
                            return Optional.of(new Tuple2<>(
                                left.v1.compareTo(right.v1) >= 0 ? left.v1 : right.v1,
                                left.v2.compareTo(right.v2) <= 0 ? left.v2 : right.v2
                            ));
                        else
                            return Optional.empty();
                    }
                    «ENDIF»

                    /**
                     * Apply this tuple as arguments to a function.
                     */
                    public final <R> R map(Function«degree»<«TN(degree)», R> function) {
                        return function.apply(this);
                    }
                    «FOR d : 1 .. degree»

                    /**
                     * Apply attribute «d» as argument to a function and return a new tuple with the substituted argument.
                     */
                    public final <U«d»> Tuple«degree»<«TN(1, d - 1)»«IF d > 1», «ENDIF»U«d»«IF d < degree», «ENDIF»«TN(d + 1, degree)»> map«d»(Function1<T«d», U«d»> function) {
                        return Tuple.tuple(«vn(1, d - 1)»«IF d > 1», «ENDIF»function.apply(v«d»)«IF d < degree», «ENDIF»«vn(d + 1, degree)»);
                    }
                    «ENDFOR»

                    @Override
                    public final Object[] array() {
                        return new Object[] { «vn(degree)» };
                    }

                    @Override
                    public final List<?> list() {
                        return Arrays.asList(array());
                    }

                    /**
                     * The degree of this tuple: «degree».
                     */
                    @Override
                    public final int degree() {
                        return «degree»;
                    }
                
                    @Override
                    @SuppressWarnings("unchecked")
                    public final Iterator<Object> iterator() {
                        return (Iterator<Object>) list().iterator();
                    }
                
                    @Override
                    public int compareTo(Tuple«degree»<«TN(degree)»> other) {
                        int result;

                        «FOR d : 1 .. degree»
                        result = Tuples.compare(v«d», other.v«d»); if (result != 0) return result;
                        «ENDFOR»

                        return result;
                    }
                
                    @Override
                    public boolean equals(Object o) {
                        if (this == o)
                            return true;
                        if (!(o instanceof Tuple«degree»))
                            return false;
                
                        @SuppressWarnings({ "unchecked", "rawtypes" })
                        final Tuple«degree»<«TN(degree)»> that = (Tuple«degree») o;

                        «FOR d : 1 .. degree»
                        if (!Objects.equals(v«d», that.v«d»)) return false;
                        «ENDFOR»
                
                        return true;
                    }
                
                    @Override
                    public int hashCode() {
                        final int prime = 31;
                        int result = 1;

                        «FOR d : 1 .. degree»
                        result = prime * result + ((v«d» == null) ? 0 : v«d».hashCode());
                        «ENDFOR»
                
                        return result;
                    }
                
                    @Override
                    public String toString() {
                        return "("
                             «FOR d : 1 .. degree»
                             + «IF d > 1»", " + «ELSE»       «ENDIF»v«d»
                             «ENDFOR»
                             + ")";
                    }
                
                    @Override
                    public Tuple«degree»<«TN(degree)»> clone() {
                        return new Tuple«degree»<>(this);
                    }
                }
                '''  
            );
        }
    }
    
    def generateFunctions() {
        for (degree : 1 .. max) {
            write(
                "org.jooq.lambda.function.Function" + degree,
                '''
                «copyright»
                package org.jooq.lambda.function;
                
                «IF degree == 1»
                import java.util.function.Function;
                «ENDIF»
                «IF degree == 2»
                import java.util.function.BiFunction;
                «ENDIF»
                import org.jooq.lambda.tuple.Tuple«degree»;

                /**
                 * A function with «degree» arguments
                 *
                 * @author Lukas Eder
                 */
                @FunctionalInterface
                public interface Function«degree»<«TN(degree)», R> «IF degree == 1»extends Function<T1, R> «ELSEIF degree == 2»extends BiFunction<T1, T2, R> «ENDIF»{
                
                    /**
                     * Apply this function to the arguments.
                     */
                    default R apply(Tuple«degree»<«TN(degree)»> args) {
                        return apply(«XXXn(degree, "args.v")»);
                    }
                
                    /**
                     * Apply this function to the arguments.
                     */
                    «IF degree <= 2»
                    @Override
                    «ENDIF»
                    R apply(«TN_XXXn(degree, "v")»);
                    «IF degree == 1»

                    /**
                     * Convert this function to a {@link java.util.function.Function}
                     */
                    default Function<T1, R> toFunction() {
                        return this::apply;
                    }

                    /**
                     * Convert to this function from a {@link java.util.function.Function}
                     */
                    static <T1, R> Function1<T1, R> from(Function<T1, R> function) {
                        return function::apply;
                    }
                    «ELSEIF degree == 2»

                    /**
                     * Convert this function to a {@link java.util.function.BiFunction}
                     */
                    default BiFunction<T1, T2, R> toBiFunction() {
                        return this::apply;
                    }

                    /**
                     * Convert to this function to a {@link java.util.function.BiFunction}
                     */
                    static <T1, T2, R> Function2<T1, T2, R> from(BiFunction<T1, T2, R> function) {
                        return function::apply;
                    }
                    «ENDIF»
                }
                '''
            )
        }
    }
}